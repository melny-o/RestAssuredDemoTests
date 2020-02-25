package RestAssuredDemoTests;

import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class GetRequest {
    @Test
    public void getWeatherDetails(){
        given()
                .when()
                    .get("http://restapi.demoqa.com/utilities/weather/city/hyderabad")
                .then()
                .statusCode(200)
                .statusLine("HTTP/1.1 200 OK")
                .assertThat().body("City", equalTo("Hyderabad"))
                .header("Content-Type", "application/json");
    }
}
