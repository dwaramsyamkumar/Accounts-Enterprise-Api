package com.lbg.ob.eaisp.moneyhub.accounts.config;

import feign.*;

// @Component
public class FeignClientBuilder {
  /*
      @Value("${wssproxy.useProxy}")
      private boolean useWssProxy;

      @Value("${wssproxy.host}")
      private String wssProxyHost;

      @Value("${wssproxy.port}")
      private int wssProxyPort;

      private final FeignConfig feignConfig;

  */
  /*
  Need this for Money Hub POST /oidc/token API as it accepts Form Data
  */
  /*

      private final ObjectFactory<HttpMessageConverters> httpMessageConvertersObjectFactory;

      @Autowired
      public FeignClientBuilder(
              FeignConfig feignConfig,
              ObjectFactory<HttpMessageConverters> httpMessageConvertersObjectFactory) {
          this.feignConfig = feignConfig;
          this.httpMessageConvertersObjectFactory = httpMessageConvertersObjectFactory;
      }

      public <T> T getFeignClient(Class<T> clientClass, String serviceName) throws Exception {
          FeignConfig.FeignConfigurations feignConfigurations =
                  feignConfig.getFeignConfigurations().get(serviceName);
          var feignClient = Feign.builder();
          feignClient
                  .options(
                          new Request.Options(
                                  feignConfigurations.getConnectTimeout(),
                                  TimeUnit.MILLISECONDS,
                                  feignConfigurations.getReadTimeout(),
                                  TimeUnit.MILLISECONDS,
                                  false))
                  .logger(new Slf4jLogger(clientClass))
                  .logLevel(Logger.Level.FULL)
                  .retryer(
                          feignConfigurations.isRetryEnabled()
                                  ? new Retryer.Default(
                                  100, 1000, feignConfigurations.getNoOfRetries())
                                  : Retryer.NEVER_RETRY);

  */
  /*
  Setting Form encoder for TinkClient as Money Hub POST /oidc/token endpoint accepts Form body
  */
  /*

      if (clientClass.getSimpleName().equals("TinkClient")) {
          feignClient.encoder(
                  new SpringFormEncoder(new SpringEncoder(httpMessageConvertersObjectFactory)));
      }

      if (useWssProxy) {
          feignClient.client(new OkHttpClient(okHttpClient()));
      } else {
          feignClient.client(new OkHttpClient());
      }
      return feignClient.target(clientClass, feignConfigurations.getUrl());

  }

  private okhttp3.OkHttpClient okHttpClient() {

      return new okhttp3.OkHttpClient.Builder()

              .proxy(

                      new Proxy(
                              Proxy.Type.HTTP, new InetSocketAddress(wssProxyHost, wssProxyPort)))
              .build();
  }

  private static ObjectMapper getObjectMapper() {
      return new ObjectMapper()
              .registerModule(new JavaTimeModule())
              .configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
  }*/
}
