package com.restAssure;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TEST_GET_02 {
	@Test
	
	void getweatherDetails()
	{		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification httpRequest = RestAssured.given();
		//Response object
		//JSONObject requestParams = new JSONObject();
		
		
		
		//httpRequest.header("Content-Type","application/json"); 
		//httpRequest.body(requestParams.toJSONString());
		
		Response response = httpRequest.request(Method.GET,"/Hyderabad");
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is:" +responseBody);
		
		int StatusCode = response.getStatusCode();
		System.out.println("StatusCode is:" +StatusCode);
		Assert.assertEquals(StatusCode,200);
		
		
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


