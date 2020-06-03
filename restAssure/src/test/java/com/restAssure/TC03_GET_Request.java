package com.restAssure;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC03_GET_Request {
	
@Test
	
	void Getheaders()
	{
	
			RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification httpRequest = RestAssured.given();
		
		Response response = httpRequest.request(Method.GET,"/Delhi");
		JsonPath jsonpath = response.jsonPath();
		
		System.out.println(jsonpath.get("City"));
		System.out.println(jsonpath.get("Temaparature"));
		System.out.println(jsonpath.get("Humidity"));
		System.out.println(jsonpath.get("WeatherDescription"));
		System.out.println(jsonpath.get("WindSpeed"));
		System.out.println(jsonpath.get("WindDirectionDegree"));
		
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



	
	
	
	
	
	
	
	
	
	
	
	


