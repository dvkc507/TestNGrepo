package restTests;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.*;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;

public class postTest {
	int bookingID;
	
	@Test
	public void createBookingID() {
		JSONObject booking = new JSONObject();
		JSONObject bookingdates = new JSONObject();
		booking.put("firstname","Chaitanya");
		booking.put("lastname","doppalapudi");
		booking.put("totalprice", 100);
		booking.put("depositpaid", true);
		booking.put("bookingdates",bookingdates);
		bookingdates.put("checkin","2013-02-23");
		bookingdates.put("checkout","2014-10-23");
		booking.put("additionalneeds", "Breakfast");

		Response response = RestAssured
		.given()
		.contentType(ContentType.JSON)
		.baseUri("https://restful-booker.herokuapp.com/booking")
		.body(booking.toString())
		.when()
		.post()
//		.then().assertThat().log().ifValidationFails().statusCode(200)
		.then().assertThat().log().all().statusCode(200)
		.header("Content-Type", "application/json; charset=utf-8")
		.body("booking.firstname", Matchers.equalTo("Chaitanya"))
		.body("booking.lastname", Matchers.equalTo("doppalapudi"))
		.extract().response();
		
		System.out.println(response.getBody().asString());
		bookingID = response.path("bookingid");
		System.out.println("created booking ID is:"+bookingID);

		Response response1 = RestAssured.
		given()
		.contentType(ContentType.JSON)
		.pathParam("bookingID", bookingID)
		.baseUri("https://restful-booker.herokuapp.com/booking")
		.when()
		.get("{bookingID}")
		.then()
		.assertThat()
		//.log().ifStatusCodeIsEqualTo(200)
		.log().all()
		.header("Content-Type", "application/json; charset=utf-8")
		.body("firstname", Matchers.equalTo("Chaitanya"))
		.body("lastname", Matchers.equalTo("doppalapudi"))
		.extract().response();
		System.out.println(response1.getBody());
	}
}
