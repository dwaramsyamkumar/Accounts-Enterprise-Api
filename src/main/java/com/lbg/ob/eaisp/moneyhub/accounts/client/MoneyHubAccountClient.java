package com.lbg.ob.eaisp.moneyhub.accounts.client;

/*

import com.lbg.ob.eaisp.moneyhub.accounts.model.MoneyHubAccountsResponse;
import feign.HeaderMap;
import feign.QueryMap;
import feign.RequestLine;
import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
*/

import com.lbg.ob.eaisp.moneyhub.accounts.model.MoneyHubAccountsResponse;
import feign.RequestLine;

// @FeignClient(url = "http://localhost:8089/moneyhub")
public interface MoneyHubAccountClient {
  /*
  @RequestLine("GET /v3/accounts")
  MoneyHubAccountsResponse getAllAccounts(
      @HeaderMap Map<String, Object> headers, @QueryMap Map<String, Object> queryParams);
  @GetMapping("/name")
  public String getUserName();*/
  /*@RequestLine("GET /getAccounts?TspUserId={TspUserId}")
  public MoneyHubAccountsResponse getAccounts(@Param("TspUserId") String tspUserId);*/
  @RequestLine("GET /")
  public MoneyHubAccountsResponse getAccounts();
}
