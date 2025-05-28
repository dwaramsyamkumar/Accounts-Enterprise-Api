package com.lbg.ob.eaisp.moneyhub.accounts.service;

import com.lbg.ob.eaisp.moneyhub.accounts.client.MoneyHubAccountClient;
import com.lbg.ob.eaisp.moneyhub.accounts.model.Account;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MoneyHubAccountServiceImpl implements MoneyHubAccountService {

  private final MoneyHubAccountClient moneyHubAccountClient;

  public MoneyHubAccountServiceImpl(MoneyHubAccountClient moneyHubAccountClient) {
    this.moneyHubAccountClient = moneyHubAccountClient;
  }

  @Override
  public List<Account> getAllAccounts() {
    return moneyHubAccountClient.getAccounts().getData();
  }
}
