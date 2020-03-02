package RestAssuredWithCucumber.steps.steps

import io.restassured.http.ContentType

import static io.restassured.RestAssured.given
import static io.restassured.RestAssured.when

class HelperSteps {
    public static void performPathParameter(String f1, String f2){
        String pathparam = f1+";"+f2;
        System.out.println(pathparam);
        given()
                .contentType(ContentType.JSON).
        with()
                .queryParam("fields", pathparam)
                .pathParam("name", "USA").
        when()
                .get("https://restcountries.eu/rest/v2/name/{name}").
        then().log().all();
                //.body("size()", is(3));

    }
}
