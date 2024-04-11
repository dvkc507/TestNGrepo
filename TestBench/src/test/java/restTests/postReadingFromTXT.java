package restTests;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.hamcrest.Matchers;
import org.json.simple.JSONArray;
import org.testng.annotations.Test;

public class postReadingFromTXT {
	public  static final String BASE_PATH = "./src/test/resources/";
	public static final String File_PATH = BASE_PATH+"\\postAPIRequest.txt";
@Test(description ="Testing post")	
public void postAPI() throws IOException {
	String postAPIRequestBody = FileUtils.readFileToString(new File(File_PATH),"UTF-8");
	Response response = RestAssured
	.given()
	.contentType(ContentType.JSON)
	.baseUri("https://restful-booker.herokuapp.com/booking")
	.body("postAPIRequestBody")
	.when()
	.post()
	.then()
	.assertThat()
	.log().all()
	.statusCode(200)
	.header("Content-Type","application/json;charset=utf-8")
	.body("booking.firstname", Matchers.equalTo("Chaitanya"))
	.body("booking.lastname", Matchers.equalTo("Doppalapudi"))
	.extract().response();
	
	boolean val = response.getBody().asString().contains("chaitanya");
	String ID = response.path("bookingid");
	System.out.println("BookingID :"+ID);
//	JSONArray objFirstName= JsonPath.read(response.getBody().asString(),"$.booking.bookingdates..checkin");
	
}


}
