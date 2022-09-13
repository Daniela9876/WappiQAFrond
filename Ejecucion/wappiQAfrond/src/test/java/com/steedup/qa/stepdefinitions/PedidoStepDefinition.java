package com.steedup.qa.stepdefinitions;

import com.steedup.qa.task.Pedido;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class PedidoStepDefinition {


    @When("^make a order$")
    public void makeAOrder() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Pedido.pedido());
    }

    @Then("^I should see in the confirmation message$")
    public void iShouldSeeInTheConfirmationMessage() {

    }
}
