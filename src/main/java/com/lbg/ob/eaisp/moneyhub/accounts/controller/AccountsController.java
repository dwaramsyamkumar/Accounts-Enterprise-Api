package com.lbg.ob.eaisp.moneyhub.accounts.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import com.lbg.ob.eaisp.moneyhub.accounts.model.AccountsResponse;
import com.lbg.ob.eaisp.moneyhub.accounts.service.AccountsService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/accounts", produces = APPLICATION_JSON_VALUE)
@Slf4j
public class AccountsController {

  private final AccountsService accountsService;

  public AccountsController(AccountsService accountsService) {
    this.accountsService = accountsService;
  }

  // @RequestParam(name = "TspUserId") String tspUserId
  @GetMapping("/getAccounts")
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<List<AccountsResponse>> getAllAccounts() throws Exception {
    log.info("Fetching all the accounts for the user ");

    List<AccountsResponse> accountsResponseList = accountsService.getAllAccounts();
    return ResponseEntity.ok().body(accountsResponseList);
  }
}
