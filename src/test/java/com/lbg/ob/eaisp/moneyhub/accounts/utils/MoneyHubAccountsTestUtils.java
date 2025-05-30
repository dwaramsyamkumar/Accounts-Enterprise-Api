package com.lbg.ob.eaisp.moneyhub.accounts.utils;

import com.lbg.ob.eaisp.moneyhub.accounts.model.AccountsResponse;
import java.util.List;

public interface MoneyHubAccountsTestUtils {

  static List<AccountsResponse> getAccountsResponse() {
    var response = new AccountsResponse();
    response.setAccountId("d372-f50a-4114-9c83-687828fa");
    response.setAccountName("Lloyds");
    response.setAccountType("personal");
    return List.of(response);
  }
}
