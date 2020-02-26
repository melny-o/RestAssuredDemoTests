package RestAssuredDemoTests;

import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostRequest {
    public static HashMap<String, String> map = new HashMap<String, String>();

    @BeforeClass
    public static void postdata(){
    map.put("FirstName", RestUtils.getFirstName());
    map.put("LastName", RestUtils.getLastName());
    map.put("UserName", RestUtils.getUserName());
    map.put("Password", RestUtils.getPassword());
    map.put("Email", RestUtils.getEmail());

        RestAssured.baseURI="http://restapi.demoqa.com/customer";
        RestAssured.basePath="/register";
    }
    @Test
    public void addCustomer(){
        given()
                .contentType("application/json")
                .body(map)
        .when()
                .post()
         .then()
                .statusCode(201)
                .body("SuccessCode", equalTo("OPERATION_SUCCESS"))
                .body("Message", equalTo( "Operation completed successfully"));


    }
}
