package Get;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class GetAllProductsList {
	@Test
	public void getAllProductsListTest() {
		RestAssured.baseURI = "https://automationexercise.com/";
		String response = given().when().get("api/productsList").then().assertThat().log().all()
				.statusCode(200).extract().asString();
		JsonPath js = new JsonPath(response);
		int productCount = js.getInt("products.size()");
		String productName = js.getString("products[0].name");
		System.out.println("Total Products : " + productCount);
		System.out.println(productName);

		String actualProductName = js.getString("products[0].name");
		System.out.println("Product Name: " + actualProductName);
		// Verify
		Assert.assertEquals(actualProductName, "Blue Top");

	}

}
