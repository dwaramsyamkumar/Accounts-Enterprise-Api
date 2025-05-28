package com.lbg.ob.eaisp.moneyhub.accounts.mapper;

import com.lbg.ob.eaisp.moneyhub.accounts.model.Account;
import com.lbg.ob.eaisp.moneyhub.accounts.model.AccountsResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AccountsResponseMapper {

  @Mapping(target = "accountId", source = "account.id")
  @Mapping(target = "accountName", source = "account.accountName")
  @Mapping(target = "accountType", source = "account.accountType")
  AccountsResponse mhAccountsToAccountsResponse(Account account);
}
