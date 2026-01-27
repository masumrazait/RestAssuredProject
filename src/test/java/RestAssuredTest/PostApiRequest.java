package RestAssuredTest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import files.payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;

public class PostApiRequest {
	public static void main(String[] args) {
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		ValidatableResponse response = given().log().all().queryParam("key", "qaclick123")
				.header("Content-Type", "application/json").body(payload.AddPlace()).when()
				.post("/maps/api/place/add/json").then().assertThat().statusCode(200).body("scope", equalTo("APP"))
				.header("Server", "Apache/2.4.52 (Ubuntu)");
		System.out.println("======================");
		System.out.println(response);
		JsonPath js = new JsonPath("response");
		String placeId = js.getString("place_Id");
		System.out.println(placeId);

		// Add place -> update place with new Address -> get Place to validate if new
		// address is present in response
	}

}
