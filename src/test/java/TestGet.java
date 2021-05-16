import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class TestGet {

	@Test
	public void Test1_get() {

		when().
			get("https://reqres.in/api/users/2").
		then().
			statusCode(200).
			log().all();
		
	}
	
}
