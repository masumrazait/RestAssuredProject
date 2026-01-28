package RestAssuredTest;

import files.payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {
	public static void main(String[] args) throws InterruptedException {
		JsonPath js = new JsonPath(payload.CoursePrice());
		int count = js.getInt("courses.size()");
		System.out.println("Number of courses in list : " + count);
		int totalAmount = js.getInt("dashboard.purchaseAmount");
		System.out.println(totalAmount);
		String CourseTitle = js.get("courses[2].title");
		System.out.println(CourseTitle);
		String CourseTitle2 = js.get("courses[3].title");
		System.out.println(CourseTitle2);

		// Print all Courses title and there price;
		for (int i = 0; i < count; i++) {
			String courseTitle = js.get("courses[" + i + "].title");
			int coursePrice = js.getInt("courses[" + i + "].price"); // if you also want price
			Thread.sleep(300);
			System.out.println(courseTitle + " : " + coursePrice);
		}
	}
}
