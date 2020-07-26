/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package rest;

import exception.ApiException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.web.util.UriTemplateHandler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @author Awanish Dwivedi
 * @version $Id: RestApiInvoke.java, v 0.1 2020-07-25 8:27 pm Awanish Dwivedi Exp $$
 */
@Slf4j
public class Rest {

    public static final String  BASE_URI= "https://developers.zomato.com/api/v2.1/";
    private static RestTemplate request;
    private static UriTemplateHandler uriTemplateHandler = new DefaultUriBuilderFactory();
    private static HttpHeaders httpHeaders;
    private static RequestResponseLoggingInterceptor requestResponseLoggingInterceptor;

    public Rest(){
        throw new IllegalStateException("Static class");
    }

    public static <T> T get(Map<String,Object> map, Class<T> responseType, String uri ) throws ApiException {
        httpHeaders =  new HttpHeaders();
        httpHeaders.add("user-key","1849af211c168e59a6276e6d2ab645e4");

        ClientHttpRequestFactory factory = new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory());
        request= new RestTemplate(factory);
        requestResponseLoggingInterceptor = new RequestResponseLoggingInterceptor();
        request.setInterceptors(Collections.<ClientHttpRequestInterceptor>singletonList(requestResponseLoggingInterceptor));



        //Adding Http converters.
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
        MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter =
                new MappingJackson2HttpMessageConverter();
        mappingJackson2HttpMessageConverter.setSupportedMediaTypes(
                Arrays.asList(MediaType.APPLICATION_JSON,MediaType.TEXT_HTML));
        messageConverters.add(mappingJackson2HttpMessageConverter);
        request.setMessageConverters(messageConverters);

        // creating query params
        MultiValueMap<String,String> params = new LinkedMultiValueMap<String, String>();
        for(Map.Entry entry:map.entrySet()){
            params.add(String.valueOf(entry.getKey()),String.valueOf(entry.getValue()));
        }
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(BASE_URI+uri).queryParams(params);
        ResponseEntity<T> response = request.exchange(builder.build().toUri(), HttpMethod.GET,new HttpEntity<Object>(httpHeaders), responseType);

        log.info("response : {}",response.getStatusCode());

        if(response.getStatusCodeValue() != 200){
            throw new ApiException(String.format("API failed with status code %s",response.getStatusCode()));
        }
        return response.getBody();


    }
}