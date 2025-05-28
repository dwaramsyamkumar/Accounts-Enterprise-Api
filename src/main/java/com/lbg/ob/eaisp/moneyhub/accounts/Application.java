package com.lbg.ob.eaisp.moneyhub.accounts;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties
@EnableFeignClients("com.lbg.ob.eaisp.moneyhub.accounts")
@EnableCaching
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Bean
  public ObjectMapper objectMapper() {
    return new ObjectMapper()
        .setSerializationInclusion(JsonInclude.Include.NON_NULL)
        .registerModule(new JavaTimeModule());
  }

  @Bean
  public ModelMapper getModelMapper() {
    return new ModelMapper();
  }
  /*@Bean
  public ObjectMapper getObjectMapper(){
    return new ObjectMapper()
            .enable(JsonParser.Feature.STRICT_DUPLICATE_DETECTION)
            .registerModule(new JavaTimeModule());
  }*/
  // @Bean
  // @Primary
  /*public ObjectMapper objectMapper() {
   */
  /*ObjectMapper objectMapper =new ObjectMapper();
  objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
  objectMapper.setDefaultPropertyInclusion(JsonInclude.Include.NON_NULL);
  objectMapper.registerModule(new JavaTimeModule());
  return objectMapper;*/
  /*
    return new ObjectMapper()
            .setSerializationInclusion(JsonInclude.Include.NON_NULL)
            .registerModule(new JavaTimeModule());
  }*/
}
