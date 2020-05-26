package co.com.pruebas.screenplay.tasks;


import co.com.pruebas.screenplay.ui.CodigosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class PaginaInicioCodigos implements Task {

    private CodigosPage codigosPage;
    private String usuario;
    private String contrasenia;

    public PaginaInicioCodigos(String usuario, String contrasenia){
        this.usuario=usuario;
        this.contrasenia=contrasenia;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Open.browserOn(codigosPage),
                Enter.theValue(usuario).into(codigosPage.USERNAME),
                Enter.theValue(contrasenia).into(codigosPage.PASSWORD),
                Click.on(codigosPage.LOGIN));

    }

    public static PaginaInicioCodigos laPaginaWeb(String correo, String contrasenia){
        return Tasks.instrumented(PaginaInicioCodigos.class,correo,contrasenia);
    }
}
