 import io.restassured.RestAssured;
 import static io.restassured.RestAssured.*;
public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		given().queryParam("key", "qaclick123").header("content-type","application/json")
		.body(""))
	}

}