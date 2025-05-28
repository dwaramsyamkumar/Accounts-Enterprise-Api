package com.lbg.ob.eaisp.moneyhub.accounts.service;

import com.lbg.ob.eaisp.moneyhub.accounts.mapper.AccountsResponseMapper;
import com.lbg.ob.eaisp.moneyhub.accounts.model.AccountsResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
@Slf4j
public class AccountsServiceImpl implements AccountsService {

  private final MoneyHubAccountService moneyHubService;
  private final AccountsResponseMapper accountsMapper;

  public AccountsServiceImpl(
      MoneyHubAccountService moneyHubAccountService, AccountsResponseMapper accountsMapper) {
    this.moneyHubService = moneyHubAccountService;
    this.accountsMapper = accountsMapper;
  }

  public List<AccountsResponse> getAllAccounts() {
    var moneyHubAccounts = moneyHubService.getAllAccounts();
    if (Optional.ofNullable(moneyHubAccounts).isPresent()
        && !CollectionUtils.isEmpty(moneyHubAccounts)) {
      return moneyHubAccounts.stream().map(accountsMapper::mhAccountsToAccountsResponse).toList();
    }
    return new ArrayList<>();
  }
}
