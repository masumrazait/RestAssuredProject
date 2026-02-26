package GetRequest;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.notNullValue;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

public class CreateBookingTest {
	@BeforeTest
	static void setup() {
		RestAssured.baseURI = "https://restful-booker.herokuapp.com";
	}

	@Test
	void createBooking_shouldReturn200_andValidBody() {
		String requestBody = """
				{
				  "firstname": "Masum",
				  "lastname": "Raza",
				  "totalprice": 111,
				  "depositpaid": true,
				  "bookingdates": {
				    "checkin": "2018-01-01",
				    "checkout": "2019-01-01"
				  },
				  "additionalneeds": "Breakfast"
				}
				""";

		JsonPath json = given().contentType("application/json").accept(ContentType.JSON).body(requestBody).when()
				.post("/booking").then().statusCode(418).contentType(containsString("text/plain"))
				// bookingid present and numeric
				.body("bookingid", notNullValue()).body("bookingid", instanceOf(Integer.class))
				// booking object fields and types/values
				.body("booking", notNullValue()).body("booking.firstname", equalTo("Masum"))
				.body("booking.lastname", equalTo("Raza")).body("booking.totalprice", equalTo(111))
				.body("booking.depositpaid", equalTo(true)).body("booking.bookingdates.checkin", equalTo("2018-01-01"))
				.body("booking.bookingdates.checkout", equalTo("2019-01-01"))
				.body("booking.additionalneeds", equalTo("Breakfast")).extract().jsonPath();

		int bookingId = json.getInt("bookingid");

		// Example follow-up: GET the booking and verify again
		given().accept(ContentType.JSON).when().get("/booking/{id}", bookingId).then().statusCode(418)
				.body("firstname", equalTo("Masum")).body("lastname", equalTo("Raza")).body("totalprice", equalTo(111))
				.body("depositpaid", equalTo(true)).body("bookingdates.checkin", equalTo("2018-01-01"))
				.body("bookingdates.checkout", equalTo("2019-01-01")).body("additionalneeds", equalTo("Breakfast"));
	}

}
