package GetRequest;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;

import io.restassured.RestAssured;

public class GetRequet {
	public static void main(String[] args) {
		RestAssured.baseURI = "https://restful-booker.herokuapp.com";
		String response = given().log().all().when().get("booking/1").then().assertThat()
				.body("firstname", equalTo("Mary")).log().all().statusCode(200).extract().response().asString();

		System.out.println(response);
	}

}
