package RestAssuredDemoTests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteRequest {
static int employeeId = 7;
    @Test
    public void deleteEmployee(){
        RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
        RestAssured.basePath="/delete/"+employeeId;
        Response response =
        given()
        .when()
                .delete()
         .then()
                .statusCode(200)
                .statusLine("HTTP/1.1 200 OK")
                .log().all()
                .extract().response();
        String jsonAsString = response.asString();
        Assert.assertEquals(jsonAsString.contains("successfully! deleted Records"), true);
    }
}
