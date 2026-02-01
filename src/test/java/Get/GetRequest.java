package Get;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItem;

import io.restassured.RestAssured;

public class GetRequest {
	public static void main(String[] args) {
		RestAssured.baseURI = "https://dummy.restapiexample.com";
		given().queryParam("employee_name", "Bradley Greer").when()
				.get("/api/v1/employees").then().assertThat().log().all().statusCode(200)
				.body("message", equalTo("Successfully! All records has been fetched."))
				.body("data.employee_name", hasItem("Bradley Greer"));;
	}
}
