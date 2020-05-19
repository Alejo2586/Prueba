package co.com.pruebas.screenplay.stepdefinitions;


import co.com.pruebas.screenplay.questions.MensajeInicioSesionEsperado;
import co.com.pruebas.screenplay.questions.MensajeRegistroEsperado;
import co.com.pruebas.screenplay.tasks.AbrirPaginaInicio;
import co.com.pruebas.screenplay.tasks.AbrirPaginaRegistro;
import static org.hamcrest.Matchers.equalTo;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class EspacioEducativoStepDefinition {

    @Managed(driver="chrome")
    private WebDriver suNavegador;
    private Actor user = Actor.named("User");

    @Before
    public void configuracionInicial() {
        user.can(BrowseTheWeb.with(suNavegador));
    }


    @When("^Ingreso a la pagina de registro para ingresar el \"([^\"]*)\" el \"([^\"]*)\" el \"([^\"]*)\" la \"([^\"]*)\" y la \"([^\"]*)\"$")
    public void ingresoALaPaginaDeRegistroParaIngresarElElElLaYLa(String nombre, String apellido, String correo, String contrasenia, String cedula) {
        user.wasAbleTo(AbrirPaginaRegistro.laPaginaWeb(nombre,apellido,correo,contrasenia,cedula));
    }


    @Then("^Valido el mensaje de \"([^\"]*)\"$")
    public void validoElMensajeDe(String validacion) {
        user.should(seeThat(MensajeRegistroEsperado.esCorrecto(),equalTo(validacion)));
    }

    @When("^Ingreso a la pagina e ingresio mi \"([^\"]*)\" y \"([^\"]*)\"$")
    public void ingresoALaPaginaEIngresioMiY(String correo, String contrasenia) {
        user.wasAbleTo(AbrirPaginaInicio.laPaginaWeb(correo,contrasenia));
    }


    @Then("^Valido el mensaje de \"([^\"]*)\" para inicio de sesion$")
    public void validoElMensajeDeParaInicioDeSesion(String validacion) {
        user.should(seeThat(MensajeInicioSesionEsperado.esCorrecto(),equalTo(validacion)));
    }

}
