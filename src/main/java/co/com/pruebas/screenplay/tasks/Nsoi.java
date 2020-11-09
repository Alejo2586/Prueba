package co.com.pruebas.screenplay.tasks;


import co.com.pruebas.screenplay.ui.NsoiPage;
import co.com.pruebas.screenplay.ui.PaginaInicioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.selectactions.SelectByIndexFromElement;
import net.thucydides.core.model.DataTable;

import javax.xml.crypto.Data;

public class Nsoi implements Task {

    private NsoiPage nsoiPage;
    private DataTable datos;

    public Nsoi(DataTable datos){
        this.datos=datos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //actor.wasAbleTo(Open.browserOn(nsoiPage),
        //        SelectFromOptions.byIndex(datos.)
        //        Enter .theValue(correo).into(nsoiPage.e),
        //        Enter.theValue(contrasenia).into(paginaInicioPage.CONTRASENIA),
        //        Click.on(paginaInicioPage.INICIO_SESION));

    }

    public static Nsoi laPaginaWeb(DataTable datos){
        return Tasks.instrumented(Nsoi.class,datos);
    }
}
