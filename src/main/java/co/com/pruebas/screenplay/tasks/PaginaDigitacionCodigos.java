package co.com.pruebas.screenplay.tasks;


import co.com.pruebas.screenplay.ui.CodigosPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class PaginaDigitacionCodigos implements Task {

    private CodigosPage codigosPage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Click.on(codigosPage.START));

        for(int i=0;i < 100000; i++) {
            List<WebElementFacade> primerNumero = codigosPage.IMAGEN1.resolveAllFor(actor);
            List<WebElementFacade> segundoNumero = codigosPage.IMAGEN2.resolveAllFor(actor);
            List<WebElementFacade> tercerNumero = codigosPage.IMAGEN3.resolveAllFor(actor);
            String numeroEntero = primerNumero.get(0).getAttribute("src").substring(35, 36) + segundoNumero.get(0).getAttribute("src").substring(35, 36) + tercerNumero.get(0).getAttribute("src").substring(35, 36);
            actor.wasAbleTo(Enter.theValue(numeroEntero).into(codigosPage.TEXTO));
            actor.wasAbleTo(Click.on(codigosPage.CONTINUE));
        }

    }

    public static PaginaDigitacionCodigos laPaginaWeb(){
        return Tasks.instrumented(PaginaDigitacionCodigos.class);
    }
}
