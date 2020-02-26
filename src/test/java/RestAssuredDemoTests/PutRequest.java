package RestAssuredDemoTests;

import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PutRequest {
    public static HashMap<String, String> map = new HashMap<String, String>();
    static int employeeId = 4;
    @BeforeClass
    public static void data(){
    map.put("data.employee_name", RestUtils.employeeName());
    map.put("data.employee_salary", RestUtils.employeeSalary());
    map.put("data.employee_age", RestUtils.employeeAge());

        RestAssured.baseURI="http://dummy.restapiexample.com/api/v1/update";
        RestAssured.basePath="/"+ employeeId;
    }
    @Test
    public void updateEmployee(){
        given()
                .contentType("application/json")
                .body(map)
        .when()
                .put()
        .then()
                .statusCode(200)
                //.body("data.name", equalTo("Tom"))
                .body("status", equalTo("success"))
                .log().all();

    }
}
