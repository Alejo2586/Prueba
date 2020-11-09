package co.com.pruebas.screenplay.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/nuevo_soi.feature",
        glue="co.com.pruebas.screenplay.stepdefinitions",
        snippets=SnippetType.CAMELCASE)
public class NsoiRunner {
}
