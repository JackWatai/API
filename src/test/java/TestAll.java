import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class TestAll {

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
	
	@Test
	public void Test2_put() {
		
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
	
	@Test
	public void Test3_patch() {
		
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
	
	@Test
	public void Test3_get() {

		when().
			get("https://reqres.in/api/users/2").
		then().
			statusCode(200).
			log().all();
		
	}
	
	@Test
	public void Test4_delete() {

		when().
			delete("https://reqres.in/api/users/2").
		then().
			statusCode(204).
			log().all();
		
	}

	
}
