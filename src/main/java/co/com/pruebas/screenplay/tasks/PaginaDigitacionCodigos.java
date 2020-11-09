package co.com.pruebas.screenplay.tasks;


import co.com.pruebas.screenplay.ui.CodigosPage;
import co.com.pruebas.screenplay.util.UtilidadTiempo;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class PaginaDigitacionCodigos implements Task {

    private CodigosPage codigosPage;
    private String dinero;

    public PaginaDigitacionCodigos(String dinero){
        this.dinero=dinero;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Click.on(codigosPage.START));
        int cantidadCiclo= Integer.parseInt(dinero)*10;
        for(int i=0;i < cantidadCiclo; i++) {
            List<WebElementFacade> primerNumero = codigosPage.IMAGEN1.resolveAllFor(actor);
            List<WebElementFacade> segundoNumero = codigosPage.IMAGEN2.resolveAllFor(actor);
            List<WebElementFacade> tercerNumero = codigosPage.IMAGEN3.resolveAllFor(actor);
            String numeroEntero = primerNumero.get(0).getAttribute("src").substring(36, 37) + segundoNumero.get(0).getAttribute("src").substring(36, 37) + tercerNumero.get(0).getAttribute("src").substring(36, 37);
            actor.wasAbleTo(Enter.theValue(numeroEntero).into(codigosPage.TEXTO));
            actor.wasAbleTo(Click.on(codigosPage.CONTINUE));
        }
        actor.wasAbleTo(Click.on(codigosPage.LOGOUT));
        UtilidadTiempo.esperar(3);

    }

    public static PaginaDigitacionCodigos laPaginaWeb(String dinero){
        return Tasks.instrumented(PaginaDigitacionCodigos.class,dinero);
    }
}
