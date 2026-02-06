package PostRequest;

import static io.restassured.RestAssured.given;

public class PostRequest {
	public static void main(String[] args) {
		String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body("{\r\n" + "    \"location\": {\r\n" + "        \"latitude\": \"-38.383494\",\r\n"
						+ "        \"longitude\": \"33.427362\"\r\n" + "    },\r\n" + "    \"accuracy\": \"50\",\r\n"
						+ "    \"name\": \"Masum Flat\",\r\n" + "    \"phone_number\": \"(+91) 983 893 3937\",\r\n"
						+ "    \"address\": \"29, side layout, cohen 09\",\r\n"
						+ "    \"types\": \"shoe park,shop\",\r\n" + "    \"website\": \"http://google.com\",\r\n"
						+ "    \"language\": \"French-IN\"\r\n" + "}")
				.when().post("https://rahulshettyacademy.com/maps/api/place/add/json").then().statusCode(200).extract()
				.toString();
		System.out.println(response);
		
	}
}
