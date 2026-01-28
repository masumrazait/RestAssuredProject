package RestAssuredTest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.Test;

public class Api_Testing {
	@Test
	public void createEmployeeTest() {
		// 1. Create an instance of the POJO class and set values
		EmployeePojo employee = new EmployeePojo();
		employee.setFirstName("Raza");
		employee.setLastName("Masum");
		employee.setAge(29);
		employee.setSalary(3434343.0);
		employee.setMarried(false);

		// 2. Pass the POJO object to the body() method
		given().log().all().contentType("application/json").body(employee) // Rest Assured serializes the POJO to JSON
				.when().post("https://dummy.restapiexample.com/api/v1/create").then().assertThat().log().all()
				.statusCode(200).body("message", equalTo("Successfully! Record has been added."));

	}
}
