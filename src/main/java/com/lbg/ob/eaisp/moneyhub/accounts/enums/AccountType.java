package com.lbg.ob.eaisp.moneyhub.accounts.enums;

import lombok.Getter;

@Getter
public enum AccountType {
  PERSONAL("personal"),
  BUSINESS("business");

  private final String description;

  AccountType(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return this.description;
  }
}
