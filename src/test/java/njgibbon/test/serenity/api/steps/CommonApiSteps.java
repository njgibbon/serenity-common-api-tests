package njgibbon.test.serenity.api.steps;

import njgibbon.test.utils.PropertyConfig;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;

import static net.serenitybdd.rest.SerenityRest.when;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

public class CommonApiSteps
{



    @Given("^The correct baseURI (.*?)$")
    public void the_correct_base_uri(String baseURI)
    {
        //code to turn the passed in property reference to a url string
        //String newUrl = PropertyConfig.get(baseURI);
        //System.out.println(PropertyConfig.get("mediumURL"));
        RestAssured.baseURI = baseURI;
    }

    @When("^I get the endpoint (.*?)$")
    public void i_hit_the_endpoint(String endpointPath) {
        when().get("/{endpointPath}", endpointPath).prettyPrint();

    }

    @Then("^I should get a (\\d+) status code$")
    public void i_should_get_a_specified_status_code(int statusCode)
    {
        then().statusCode(statusCode);
    }

    @Then("^I should get a (.*?) content type$")
    public void i_should_get_a_specified_content_type(String contentType)
    {
        then().contentType(contentType);
    }


    @Then("^The response should contain \"([^\"]*)\"$")
    public void the_response_should_contain(String contentToSearch)
    {
        then().assertThat().body(containsString(contentToSearch));
    }
}
