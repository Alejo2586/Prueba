package co.com.pruebas.screenplay.stepdefinitions;

import co.com.pruebas.screenplay.tasks.FormularioDatosBasicosSmartClases;
import cucumber.api.java.Before;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

//import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
//import static org.hamcrest.Matchers.equalTo;

public class ProgramarClaseQuizSmartStepDefinition {

    @Managed(driver="chrome")
    private WebDriver suNavegador;
    private Actor user = Actor.named("User");

    @Before
    public void configuracionInicial() {
        user.can(BrowseTheWeb.with(suNavegador));
    }

    @When("^Lleno el formulario en la parte de datos personales para llenar el \"([^\"]*)\" el \"([^\"]*)\" el \"([^\"]*)\" y el \"([^\"]*)\"$")
    public void llenoElFormularioEnLaParteDeDatosPersonalesParaLlenarElElElYEl(String email, String codigoEstudiante, String nombreApellidos, String celular) {
        user.wasAbleTo(FormularioDatosBasicosSmartClases.paraColocar(email,codigoEstudiante,nombreApellidos,celular));
    }


    @When("^Indico el \"([^\"]*)\" e ingreso el \"([^\"]*)\"$")
    public void indicoElEIngresoEl(String servicioATomar, String nivelIngles) {
    }

    @When("^Indico la \"([^\"]*)\" el \"([^\"]*)\" que deseo y la \"([^\"]*)\" con la \"([^\"]*)\"$")
    public void indicoLaElQueDeseoYLaConLa(String notaQuiz, String claseATomar, String dia, String hora) {
    }

}
