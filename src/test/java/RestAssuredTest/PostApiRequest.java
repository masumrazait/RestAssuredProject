package RestAssuredTest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.Assert;

import files.payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class PostApiRequest {
	public static void main(String[] args) {
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body(payload.AddPlace()).when().post("/maps/api/place/add/json").then().assertThat().statusCode(200)
				.body("scope", equalTo("APP")).header("Server", "Apache/2.4.52 (Ubuntu)").extract().response()
				.asString();
		System.out.println("======================");
		System.out.println(response);
		JsonPath js = new JsonPath(response);
		String placeId = js.getString("place_id");
		System.out.println(placeId);

		// Add place -> update place with new Address -> get Place to validate if new
		// address is present in response
		// Update Place

		String newAddress = "Delhi Lakshmi Nagar,70";

		given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body("{\r\n" + "     \"place_id\": \"" + placeId + "\",\r\n" + "     \"address\": \"" + newAddress
						+ "\",\r\n" + "     \"key\": \"qaclick123\"\r\n" + "\r\n" + "}")
				.when().put("/maps/api/place/update/json").then().assertThat().log().all().statusCode(200)
				.body("msg", equalTo("Address successfully updated"));

		// Get Api
		String getPlaceResponse = given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeId)
				.when().get("/maps/api/place/get/json").then().assertThat().log().all().statusCode(200).extract()
				.response().asString();
		JsonPath js1 = new JsonPath(getPlaceResponse);
		String actualAddress = js1.getString("address");
		System.out.println(actualAddress);
		Assert.assertEquals(actualAddress, newAddress);
	}

}
