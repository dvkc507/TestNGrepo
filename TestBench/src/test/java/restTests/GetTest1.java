package restTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetTest1 {
	@Test
	public void getAllBookingIds() {
		Response response = RestAssured.
				given()
				.contentType(ContentType.JSON)
				.baseUri("https://restful-booker.herokuapp.com/booking")
				.log().body().
				when()
				.get()
				.then()
				.assertThat()
				.log().all()
				.statusCode(200)
				.header("Content-Type", "application/json; charset=utf-8")
				.extract().response();
		boolean val = response.getBody().asString().contains("bookingid");
		Assert.assertTrue(val, "Does not contains bookingid");

	}
	
}
