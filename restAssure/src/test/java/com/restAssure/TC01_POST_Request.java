package com.restAssure;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC01_POST_Request {
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@SuppressWarnings("unchecked")
	@Test
	
void responsecode()

{
	RestAssured.baseURI = "http://dzeepublicplan.dzeecloud.com:8080/NewFinancialPlanner/api/v1";
	RequestSpecification httpRequest = RestAssured.given();
	//Response object
	JSONObject requestParams = new JSONObject();
	
	requestParams.put("birthDate","02-2000");
	requestParams.put("retirementYear","02-2062");
	requestParams.put("lifeExpectancy", "70");
	requestParams.put("planType", "PlATINUM");
	requestParams.put("healthGrade", "2");
	requestParams.put("stateName", "COLORADO");
	requestParams.put("retirementState", "COLORADO");
	requestParams.put("boughtPlanA", "true");
	requestParams.put("dental", "true");
	requestParams.put("dentalHealthGrade", "3");
	requestParams.put("tobacco", "true");
	
	/*requestParams.put("FirstName","oiiu");
	requestParams.put("LastName","XYZ");
	requestParams.put("UserName", "swapna");
	requestParams.put("Password", "PlATINUM");
	requestParams.put("Email", "swapna@gmail.com");*/
	
	
	httpRequest.header("Content-Type","application/json"); 
	httpRequest.body(requestParams.toJSONString());
	
	given().contentType(ContentType.JSON).
	header("Authorization","Basic RmluYW5jaWFsUGxhbm5lclNlcnZpY2VVc2VyOkZpbmFuY2lhbFBsYW5uZXJQQHNzdzByZA==");
	
               	Response response = httpRequest.request(Method.POST,"http://dzeepublicplan.dzeecloud.com:8080/NewFinancialPlanner/api/v1/individualPreMedicareR3");

	System.out.println("Response Body is:" +response);
	
	int StatusCode = response.getStatusCode();
	System.out.println("StatusCode is:" +StatusCode);
	Assert.assertEquals(StatusCode,200);
	
	String Successcode =response.jsonPath().get("SUCCESSCODE"); 
	Assert.assertEquals(Successcode,"OPERATION_SUCCESS");
	
	
		
}

	private RequestSpecification given() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
