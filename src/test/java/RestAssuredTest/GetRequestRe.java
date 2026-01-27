package RestAssuredTest;

import static io.restassured.RestAssured.given;

public class GetRequestRe {
	public static void main(String[] args) {
		given().log().all().baseUri("https://rahulshettyacademy.com").queryParam("key", "qaclick123").when()
				.get("/maps/api/place/get/json").then().assertThat().log().all().statusCode(200);
	}
}
