package com.lbg.ob.eaisp.moneyhub.accounts.feign;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties
@Component
public class FeignConfig {

  private Map<String, FeignConfigurations> feignConfigurations;

  @Data
  @AllArgsConstructor
  @NoArgsConstructor
  public static class FeignConfigurations {
    private String url;
    private long connectTimeout;
    private long readTimeout;
    private boolean retryEnabled;
    private int noOfRetries;
  }
}
