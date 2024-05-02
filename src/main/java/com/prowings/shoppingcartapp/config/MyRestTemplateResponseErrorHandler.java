//package com.prowings.shoppingcartapp.config;
//
//import java.io.IOException;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.HttpStatusCode;
//import org.springframework.http.client.ClientHttpResponse;
//import org.springframework.web.client.HttpClientErrorException;
//import org.springframework.web.client.ResponseErrorHandler;
//
//import com.prowings.shoppingcartapp.exception.NotFoundException;
//
//@Configuration
//public class MyRestTemplateResponseErrorHandler implements ResponseErrorHandler {
//
//	@Override
//	public boolean hasError(ClientHttpResponse response) throws IOException {
//		return response.getStatusCode().is5xxServerError() || response.getStatusCode().is4xxClientError();
//	}
//
//	@Override
//	public void handleError(ClientHttpResponse response) throws IOException {
//		
//		if(response.getStatusCode().is5xxServerError())
//			throw new HttpClientErrorException(response.getStatusCode());
//		else if (response.getStatusCode().is4xxClientError()) {
//			if(response.getStatusCode() == HttpStatus.METHOD_NOT_ALLOWED)
//				throw new NotFoundException("Method not allowed on terget api!!");
//		}
//		
//	}
//	
//	
//
//}
