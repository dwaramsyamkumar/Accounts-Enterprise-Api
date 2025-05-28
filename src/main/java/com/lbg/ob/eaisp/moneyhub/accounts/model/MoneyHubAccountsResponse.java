package com.lbg.ob.eaisp.moneyhub.accounts.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MoneyHubAccountsResponse {

  @JsonProperty("Data")
  private List<Account> data;

  /*@JsonProperty("Links")
  private Links links;

  @JsonProperty("Meta")
  private Meta meta;*/
}
