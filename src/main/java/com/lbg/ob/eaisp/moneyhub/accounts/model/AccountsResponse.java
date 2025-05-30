package com.lbg.ob.eaisp.moneyhub.accounts.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AccountsResponse {

  @JsonProperty("AccountId")
  @Schema(example = "d372-f50a-4114-9c83-687828fa")
  private String accountId;

  @JsonProperty("AccountName")
  @Schema(example = "Lloyds")
  private String accountName;

  @JsonProperty("AccountType")
  @Schema(example = "personal")
  private String accountType;

  //  @JsonProperty("AccountType")
  //  @Schema(example = "personal")
  //  private AccountType accountType;
}
