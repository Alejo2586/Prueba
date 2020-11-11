package co.com.pruebas.screenplay.stepdefinitions;


import co.com.pruebas.screenplay.questions.MensajeInicioSesionEsperado;
import co.com.pruebas.screenplay.questions.MensajeRegistroEsperado;
import co.com.pruebas.screenplay.questions.ReturnHomePage;
import co.com.pruebas.screenplay.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class AutomationPracticeRealPageStepDefinition {

    @Managed(driver="chrome")
    private WebDriver suNavegador;
    private Actor user = Actor.named("User");

    @Before
    public void configuracionInicial() {
        user.can(BrowseTheWeb.with(suNavegador));
    }

    @Given("^The user is on Homepage$")
    public void theUserIsOnHomepage() {
        user.wasAbleTo(HomePageRealPage.onEcommerce());
    }


    @Then("^the user clicks Women$")
    public void theUserClicksWomen() {
        user.wasAbleTo(WomenRealPage.onEcommerce());

    }

    @Then("^user clicks Tops$")
    public void userClicksTops() {
        user.wasAbleTo(WomenTopRealPage.onEcommerce());

    }

    @Then("^User Clicks blouses$")
    public void userClicksBlouses() {
        user.wasAbleTo(WomenTopBlousesRealPage.onEcommerce());
    }

    @Then("^user clicks on add to cart$")
    public void userClicksOnAddToCart() {
        user.wasAbleTo(WomenTopBlousesAdCartRealPage.onEcommerce());
    }

    @Given("^the user clicks on continue shopping$")
    public void theUserClicksOnContinueShopping() {
        user.wasAbleTo(ContinueShoppingRealPage.onEcommerce());
    }

    @Then("^the user is returned to the homepage$")
    public void theUserIsReturnedToTheHomepage() {
        user.should(seeThat(ReturnHomePage.hasOneProduct(),equalTo("Cart 1 Product")));
    }

    @Then("^user clicks Dresses$")
    public void userClicksDresses() {

    }

    @Then("^User Clicks evening dresses$")
    public void userClicksEveningDresses() {

    }

    @Then("^user clicks on \\(Quick View\\) printed dress$")
    public void userClicksOnQuickViewPrintedDress() {

    }

    @Then("^user clicks on add to cart from Pop up$")
    public void userClicksOnAddToCartFromPopUp() {

    }

    @Then("^the user clicks Cart$")
    public void theUserClicksCart() {

    }

    @Then("^user verifies the total products \"([^\"]*)\"$")
    public void userVerifiesTheTotalProducts(String arg1) {

    }

    @Then("^User Clicks checkout$")
    public void userClicksCheckout() {

    }

    @Then("^user is taken to the Authentication screen$")
    public void userIsTakenToTheAuthenticationScreen() {

    }


}
