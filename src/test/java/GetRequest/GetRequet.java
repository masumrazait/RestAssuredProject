package GetRequest;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;

public class GetRequet {
	public static void main(String[] args) {
		RestAssured.baseURI = "https://restful-booker.herokuapp.com";
		String response = given().log().all().when().get("booking").then().assertThat().statusCode(200).extract()
				.response().asString();

		System.out.println(response);
	}

}
