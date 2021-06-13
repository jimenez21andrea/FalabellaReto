package co.com.sistecredito.pruebatecnica.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/compra_falabella.feature",
        glue = "co.com.sistecredito.pruebatecnica.stepdefinitions",
        snippets = SnippetType.CAMELCASE)


public class CompraFalabella {

}
