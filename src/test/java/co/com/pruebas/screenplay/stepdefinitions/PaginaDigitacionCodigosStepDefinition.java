package co.com.pruebas.screenplay.stepdefinitions;


import co.com.pruebas.screenplay.questions.MensajeInicioSesionEsperado;
import co.com.pruebas.screenplay.tasks.PaginaDigitacionCodigos;
import co.com.pruebas.screenplay.tasks.PaginaInicioCodigos;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class PaginaDigitacionCodigosStepDefinition {

    @Managed(driver="chrome")
    private WebDriver suNavegador;
    private Actor user = Actor.named("User");

    @Before
    public void configuracionInicial() {
        user.can(BrowseTheWeb.with(suNavegador));
    }

    @When("^Ingreso a la pagina para loguearme con \"([^\"]*)\" y \"([^\"]*)\"$")
    public void ingresoALaPaginaParaLoguearmeConY(String usuario, String contrasenia) {
        user.wasAbleTo(PaginaInicioCodigos.laPaginaWeb(usuario,contrasenia));
    }


    @When("^Quiero dar muchos codigos para ganar \"([^\"]*)\"$")
    public void quieroDarMuchosCodigosParaGanar(String dinero) {
        user.wasAbleTo(PaginaDigitacionCodigos.laPaginaWeb(dinero));
    }

    @Then("^Valido cantidad total \"([^\"]*)\"$")
    public void terminoTodo(String dinero) {
        user.should(seeThat(MensajeInicioSesionEsperado.esCorrecto(),equalTo(dinero)));
    }

}
