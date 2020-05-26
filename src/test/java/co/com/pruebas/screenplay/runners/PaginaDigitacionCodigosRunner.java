package co.com.pruebas.screenplay.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/pagina_digitacion_codigos.feature",
        glue="co.com.pruebas.screenplay.stepdefinitions",
        snippets=SnippetType.CAMELCASE)
public class PaginaDigitacionCodigosRunner {
}
