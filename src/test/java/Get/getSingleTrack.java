package Get;

import static io.restassured.RestAssured.*;

public class getSingleTrack {
	public static void main(String[] args) {
		given().queryParam("term", "radiohead").queryParam("media", "music").queryParam("limit", 1)
		.when().get("/search")
	}
}