import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class TestPost {

	@Test
	public void Test1_post() {
		
		JSONObject request = new JSONObject();
		
		request.put("name", "morpheus");
		request.put("job", "leader");
		
		System.out.println(request.toJSONString());
		
		given().
			body(request.toJSONString()).
		when().
			post("https://reqres.in/api/users").
		then().
			statusCode(201).
			log().all();
		
	}
	
}
