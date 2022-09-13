package com.steedup.qa.stepdefinitions;

import com.steedup.qa.models.Data;
import com.steedup.qa.task.Login;
import com.steedup.qa.task.OpenBrowser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class LoginStepdefinitions {
    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnstage(){
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Daniela G.M");
    }
    @Given("^the user is in the page wappi$")
    public void theUserIsInThePageWappi() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.browser());
    }

    @When("^he enters the information for the login$")
    public void heEntersTheInformationForTheLogin(List<Data> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.withData(data.get(0)));
    }

    @Then("^the user should see the name\\.\\.\\.$")
    public void theUserShouldSeeTheName() {
    }

}
