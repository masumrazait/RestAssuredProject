package PutRequest;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;

public class UpdateBooking {
	public static void main(String[] args) {
		RestAssured.baseURI = "https://restful-booker.herokuapp.com";
		String reso = given().header("Content-Type", "application/json")
				.header("Accept", "application/json").header("Cookie", "token=abc123")
				.body("{\r\n" + "  \"firstname\": \"SOne\",\r\n" + "  \"lastname\": \"Brown\",\r\n"
						+ "  \"totalprice\": 111,\r\n" + "  \"depositpaid\": true,\r\n" + "  \"bookingdates\": {\r\n"
						+ "    \"checkin\": \"2018-01-01\",\r\n" + "    \"checkout\": \"2019-01-01\"\r\n" + "  },\r\n"
						+ "  \"additionalneeds\": \"Breakfast\"\r\n" + "}")
				.when().put("/booking/1").then().assertThat().log().all().statusCode(403).extract().toString();
		System.out.println(reso);
	}
}
