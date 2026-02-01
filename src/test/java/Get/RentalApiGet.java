package Get;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class RentalApiGet {
	public static void main(String[] args) {
		RestAssured.baseURI = "https://simple-tool-rental-api.glitch.me";
		String response = given().queryParam("id", "6483").queryParam("category", "trailers").when().get("/tools")
				.then().assertThat().log().all().statusCode(200).extract().asString();
		System.out.println(response);
	}
}
