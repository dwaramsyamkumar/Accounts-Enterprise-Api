package com.lbg.ob.eaisp.moneyhub.accounts.config;

import com.lbg.ob.eaisp.moneyhub.accounts.client.MoneyHubAccountClient;
import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MoneyHubClientBuilder {
  @Bean
  public MoneyHubAccountClient moneyHubClientCall() throws Exception {
    // Local Service Call
    return Feign.builder()
        // .decoder(new GsonDecoder())
        // .encoder(new GsonEncoder())
        .encoder(new JacksonEncoder())
        .decoder(new JacksonDecoder())
        .target(MoneyHubAccountClient.class, "http://localhost:8089/moneyhub");
  }

  // TODO -  Environment Service Configuration
  /*
  private final FeignClientBuilder feignClientBuilder;

  public MoneyHubClientBuilder(FeignClientBuilder feignClientBuilder1) {
      this.feignClientBuilder = feignClientBuilder1;
  }

  @Bean
  public MoneyHubAccountClient accountsEnterpriseClient() throws Exception {
      return feignClientBuilder.getFeignClient(
              TestClient.class,"money-hub-accounts");
  }*/
  // TODO -  Environment Service Call
  /* return feignClientBuilder.getFeignClient(
  MoneyHubAccountClient.class,"money-hub-accounts");*/
}
