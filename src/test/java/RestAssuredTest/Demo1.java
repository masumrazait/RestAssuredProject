package RestAssuredTest;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

/*
given()- set cookies,add auth, add param, set header, info etc....

when()- get ,post, patch,put, delete

then()- validate the status code and request body and header

*/
public class Demo1 {
	@Test
	public void getProductList() {
		given().when().get("https://automationexercise.com/api/productsList?id=1").then().statusCode(200);
	}
}
