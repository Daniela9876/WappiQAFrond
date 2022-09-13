package com.steedup.qa.stepdefinitions;

import com.steedup.qa.models.*;
import com.steedup.qa.task.Information;
import com.steedup.qa.userinterface.Photo;
import cucumber.api.java.Before;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;


public class InformationStepDef {
    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnstage(){
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Daniela G.M");
    }
    @When("^he enters the information '\"([^\"]*)\"', '\"([^\"]*)\"', '\"([^\"]*)\"', '\"([^\"]*)\"', '\"([^\"]*)\"'$")
    public void heEntersTheInformation(DataInformation Name, DataLastname Lastname, Datacountry Country, Datafecha Fecha, Datagenero Genero) {
        OnStage.theActorInTheSpotlight().attemptsTo(Information.withData(Name));
        OnStage.theActorInTheSpotlight().attemptsTo(com.steedup.qa.task.Lastname.withData(Lastname));
        OnStage.theActorInTheSpotlight().attemptsTo(com.steedup.qa.task.Fecha.withData(Fecha));
        OnStage.theActorInTheSpotlight().attemptsTo(com.steedup.qa.task.Genero.withData(Genero));
       // myBrowser.findElement(Photo).sendKeys("C:\Users\HP\Downloads\gherkin.png");

    }

}
