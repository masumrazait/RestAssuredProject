package Get;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class GetAllProductsList {
	@Test
	public void getAllProductsListTest() {
		RestAssured.baseURI = "https://automationexercise.com/";
		String response = given().log().all().when().get("api/productsList").then().assertThat().log().all()
				.statusCode(200).extract().asString();
		JsonPath js = new JsonPath(response);
		int productCount = js.getInt("products.size()");

		System.out.println("Total Products : " + productCount);
	}

}
