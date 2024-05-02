package com.prowings.shoppingcartapp.config;

import java.net.http.HttpClient;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;


@Configuration
public class RestTemplateConfig {

	@Value("${base_url}")
	private String url;

	
	@Bean
	public RestTemplate restTemplate() {
		
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.setUriTemplateHandler(new DefaultUriBuilderFactory(url));
		return restTemplate();
	}
}
