/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * @author Awanish Dwivedi
 * @version $Id: RequestResponseLoggingInterceptor.java, v 0.1 2020-07-26 1:59 pm Awanish Dwivedi Exp $$
 */

@Slf4j
public class RequestResponseLoggingInterceptor implements ClientHttpRequestInterceptor {
   // private final Logger log = (Logger) LoggerFactory.getLogger(this.getClass());

    @Override
    public ClientHttpResponse intercept(HttpRequest req, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        logRequest(req, body);
        ClientHttpResponse resp = execution.execute(req, body);
        logResponse(resp);
        return resp;
    }

    private void logRequest(HttpRequest req, byte[] body) throws IOException {
        //if (log.isDebugEnabled()) {
            log.info("===========================request begin================================================");
            log.info("URI         : {}", req.getURI());
            log.info("Method      : {}", req.getMethod());
            log.info("Headers     : {}", req.getHeaders());
            log.info("Request body: {}", new String(body, "UTF-8"));
            log.info("==========================request end================================================");

        }
   // }

    private void logResponse(ClientHttpResponse resp) throws IOException {
 //       if (log.isDebugEnabled()) {
            log.debug("============================response begin==========================================");
            log.debug("Status code  : {}", resp.getStatusCode());
            log.debug("Status text  : {}", resp.getStatusText());
//            log.debug("Headers      : {}", resp.getHeaders());
            log.debug("Response body: {}", StreamUtils.copyToString(resp.getBody(), Charset.defaultCharset()));
            log.debug("=======================response end=================================================");
        }
  //  }

}