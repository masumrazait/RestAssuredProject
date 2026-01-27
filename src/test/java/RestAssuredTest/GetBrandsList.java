package RestAssuredTest;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class GetBrandsList {
	@Test
	public void getBrandsList() {
		RestAssured.baseURI = "https://automationexercise.com/";
		given().when().get("https://automationexercise.com/api/brandsList").then().assertThat().log().all().statusCode(200);

	}

}
