package com.lbg.ob.eaisp.moneyhub.accounts.client;

import com.lbg.ob.eaisp.moneyhub.accounts.model.Account;
import feign.RequestLine;
import java.util.List;

// @Service
// @FeignClient(name = "testClient" , url = "${feignConfiguration.money-hub-accounts.url}")
// @FeignClient(name = "testClient")
public interface TestClient {
  /*@GetMapping("/name")
  public String getUserName();*/
  /*@RequestLine("GET /name")
  public String getUserName();*/

  @RequestLine("GET /getAccounts")
  public List<Account> getAccounts();
}
