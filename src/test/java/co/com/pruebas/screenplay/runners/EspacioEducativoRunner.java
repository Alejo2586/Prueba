package co.com.pruebas.screenplay.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/espacio_educativo.feature",
        glue="co.com.pruebas.screenplay.stepdefinitions",
        snippets=SnippetType.CAMELCASE)
public class EspacioEducativoRunner {
}
