package GetRequest;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class CreateBooking {
	public static void main(String[] args) {
		RestAssured.baseURI = "https://restful-booker.herokuapp.com";
		String res=given().log().all().header("Content-Type", "application/json")
				.body("{\r\n" + "  \"additionalneeds\": \"Breakfast\",\r\n" + "  \"bookingdates\": {\r\n"
						+ "    \"checkin\": \"2018-01-01\",\r\n" + "    \"checkout\": \"2019-01-01\"\r\n" + "  },\r\n"
						+ "  \"depositpaid\": true,\r\n" + "  \"firstname\": \"Simmi\",\r\n"
						+ "  \"lastname\": \"Masum\",\r\n" + "  \"totalprice\": 111\r\n" + "}")
				.accept("application/json").when().post("/booking").then().statusCode(200).extract().asString();
		
		System.out.println(res);
		
	}
}
