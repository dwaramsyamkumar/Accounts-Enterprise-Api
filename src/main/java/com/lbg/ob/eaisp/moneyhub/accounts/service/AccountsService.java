package com.lbg.ob.eaisp.moneyhub.accounts.service;

import com.lbg.ob.eaisp.moneyhub.accounts.model.AccountsResponse;
import java.util.List;

public interface AccountsService {

  List<AccountsResponse> getAllAccounts();
}
