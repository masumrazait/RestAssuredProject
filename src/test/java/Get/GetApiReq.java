package Get;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class GetApiReq {
	public static void main(String[] args) {

		RestAssured.baseURI = "https://restful-booker.herokuapp.com";
		given().queryParam("bookingid", "391").when().get("/booking").then().log().all().statusCode(200).extract().asString();
	}
}
