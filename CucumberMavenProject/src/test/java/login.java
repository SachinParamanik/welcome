import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class login {
	@Test
	void login() {
		RestAssured.given()
		.when().log().all()
		.get("https:reqres.in/api/users?page=2")
		.then().log().all();
	
		System.out.println("**********PUT**********");
		        //DEFAULT_BODY_ROOT_PATH
		        RestAssured.given()
		        .contentType(ContentType.JSON)
		        .body("{\r\n"
		                + "    \"name\": \"morpheus\",\r\n"
		                + "    \"job\": \"leader\"\r\n"
		                + "}")
		        .when().log().all()
		        .get("https://reqres.in/api/users?page=2")
		        .then().log().status();
		      
		
	}

}
