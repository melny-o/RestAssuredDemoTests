package RestAssuredWithCucumber.steps.definitionsteps;

import RestAssuredWithCucumber.steps.steps.HelperSteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.common.mapper.TypeRef;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import javax.annotation.WillCloseWhenClosed;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;

public class CountriesApiDefinitionSteps {
    public Response response;
    private HelperSteps hs;
    @When("^Client calls ([\\w\\s]+)$")
    public void getOneCountry(String country){
        given().contentType(ContentType.JSON)
        .when().get("https://restcountries.eu/rest/v2/name/"+country);
       /* .then().body("languages.name", contains("English"))
        .log().all();*/
    }

    @Then("^The language name is ([\\w\\s]+)$")
    public void verifyLanguage(String language){
        //assertThat(response).allMatch
    }
@When("^Client specifies fields to be displayed: ([\\w\\s]+) and ([\\w\\s]+)$")
    public void getFilteredView(String f1, String f2){
        hs.performPathParameter(f1, f2);
}
}
