package Get;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class getSingleTrack {
	public static void main(String[] args) {
		RestAssured.baseURI = ("https://itunes.apple.com");
		given().queryParam("term", "radiohead").queryParam("media", "music").queryParam("limit", 1).when()
				.get("/search").then().log().all().statusCode(200);
	}
}