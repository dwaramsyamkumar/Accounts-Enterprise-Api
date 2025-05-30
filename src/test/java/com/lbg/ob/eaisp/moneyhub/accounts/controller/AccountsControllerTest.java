package com.lbg.ob.eaisp.moneyhub.accounts.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.lbg.ob.eaisp.moneyhub.accounts.model.AccountsResponse;
import com.lbg.ob.eaisp.moneyhub.accounts.service.AccountsService;
import com.lbg.ob.eaisp.moneyhub.accounts.utils.MoneyHubAccountsTestUtils;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ExtendWith(MockitoExtension.class)
class AccountsControllerTest {

  @InjectMocks private AccountsController accountsController;

  @Mock private AccountsService accountsService;

  @Mock private MockMvc mockMvc;

  @BeforeEach
  void setUp() {
    this.mockMvc =
        MockMvcBuilders.standaloneSetup(accountsController)
            // .setControllerAdvice(new AccountsEnterpriseExceptionHandler())
            // .setCustomArgumentResolvers(new ContextInformationResolver())
            .build();
  }

  @Test
  void shouldGetAccounts() throws Exception {
    // Arrange
    // var tspUserId = "1234";
    var accountsResponse = MoneyHubAccountsTestUtils.getAccountsResponse();

    // Mock
    when(accountsService.getAllAccounts()).thenReturn(accountsResponse);

    // Act
    var result =
        mockMvc
            .perform(MockMvcRequestBuilders.get("/v1/accounts/getAccounts"))
            // .param("TspUserId", tspUserId)
            // .headers(headers))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andReturn();
    var response = result.getResponse().getContentAsString();
    var accounts =
        Arrays.asList(
            new ObjectMapper()
                .registerModule(new JavaTimeModule())
                .readValue(response, AccountsResponse[].class));

    // Assert
    assertThat(accounts).isNotNull();
    assertThat(accounts).isNotEmpty();

    // Verity
    verify(accountsService, times(1)).getAllAccounts();
    verifyNoMoreInteractions(accountsService);
  }
}
