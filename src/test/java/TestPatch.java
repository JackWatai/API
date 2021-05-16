import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class TestPatch {

	@Test
	public void Test1_patch() {
		
		JSONObject request = new JSONObject();
		
		request.put("name", "morpheus");
		request.put("job", "zion residen");
		
		System.out.println(request.toJSONString());
		
		given().
			body(request.toJSONString()).
		when().
			patch("https://reqres.in/api/users/2").
		then().
			statusCode(200).
			log().all();
		
	}
	
}
