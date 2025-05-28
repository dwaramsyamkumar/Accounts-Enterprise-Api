package com.lbg.ob.eaisp.moneyhub.accounts.model;

/*
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lbg.ob.eaisp.moneyhub.accounts.enums.AccountType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;*/

import lombok.Data;

/*@Getter
@Setter
@NoArgsConstructor*/
@Data
public class Account {
  private long id;
  private String accountName;
  private String accountType;
  /*
  @JsonProperty("Id")
  @Schema(example = "d372-f50a-4114-9c83-687828fa")
  private String id;

  @JsonProperty("DateAdded")
  @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.sss'Z'")
  @Schema(type = "string", example = "d372-f50a-4114-9c83-687828fa")
  private LocalDateTime dateAdded;

  @JsonProperty("AccountType")
  @Schema(example = "personal")
  private AccountType accountType;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LocalDateTime getDateAdded() {
    return dateAdded;
  }

  public void setDateAdded(LocalDateTime dateAdded) {
    this.dateAdded = dateAdded;
  }

  public AccountType getAccountType() {
    return accountType;
  }

  public void setAccountType(AccountType accountType) {
    this.accountType = accountType;
  }*/
}
