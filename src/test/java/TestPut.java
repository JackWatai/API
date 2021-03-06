import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class TestPut {

	@Test
	public void Test1_put() {
		
		JSONObject request = new JSONObject();
		
		request.put("name", "morpheus");
		request.put("job", "zion resident");
		
		System.out.println(request.toJSONString());
		
		given().
			body(request.toJSONString()).
		when().
			put("https://reqres.in/api/users/2").
		then().
			statusCode(200).
			log().all();
		
	}
	
}
