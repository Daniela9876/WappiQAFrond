package com.steedup.qa.renners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/Pedido.feature"
        ,glue = "com.steedup.qa.stepdefinitions"
        ,snippets = SnippetType.CAMELCASE)
public class PedidoRunner {
}
