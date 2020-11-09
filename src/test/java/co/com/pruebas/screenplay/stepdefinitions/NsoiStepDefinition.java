package co.com.pruebas.screenplay.stepdefinitions;


import co.com.pruebas.screenplay.questions.MensajeInicioSesionEsperado;
import co.com.pruebas.screenplay.questions.MensajeRegistroEsperado;
import co.com.pruebas.screenplay.tasks.AbrirPaginaInicio;
import co.com.pruebas.screenplay.tasks.AbrirPaginaRegistro;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.model.DataTable;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class NsoiStepDefinition {

    @Managed(driver="chrome")
    private WebDriver suNavegador;
    private Actor user = Actor.named("User");

    @Before
    public void configuracionInicial() {
        user.can(BrowseTheWeb.with(suNavegador));
    }


    @When("^Inicio sesion en nsoi$")
    public void inicioSesionEnNsoi(DataTable arg1) {


    }

}
