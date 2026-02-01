package RestAssuredTest;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;

public class GetRequesta {
	public static void main(String[] args) {
		RestAssured.baseURI = "https://postman-echo.com";
		given().queryParam("foo1", "bar1").queryParam("foo2", "bar2").when().get("/get").then().log().all().assertThat()
				.statusCode(200);

	}
}
