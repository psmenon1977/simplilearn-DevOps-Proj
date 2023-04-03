package com.simplilearn.restfulservice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.jupiter.api.Test;

public class HelloWorldControllerTest {

	@Test
	public void givenUserDoesNotExists_whenUserInfoIsRetrieved_then404IsReceived()
	  throws ClientProtocolException, IOException {
	 
	    // Given
	    
	    HttpUriRequest request = new HttpGet( "http://localhost:8081/certProj/greeting?name=User" );

	    // When
	    HttpResponse httpResponse = HttpClientBuilder.create().build().execute( request );
	    System.out.println("httpResponse.getStatusLine().getStatusCode()>>>>"+httpResponse.getStatusLine().getStatusCode());
	    // Then
	    assertEquals(httpResponse.getStatusLine().getStatusCode(), HttpStatus.SC_NOT_FOUND);
	}
}
