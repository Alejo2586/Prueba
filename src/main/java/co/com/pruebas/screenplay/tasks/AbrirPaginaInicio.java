package co.com.pruebas.screenplay.tasks;


import co.com.pruebas.screenplay.ui.PaginaInicioPage;
import co.com.pruebas.screenplay.ui.PaginaRegistroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPaginaInicio implements Task {

    private PaginaInicioPage paginaInicioPage;
    private String correo;
    private String contrasenia;

    public AbrirPaginaInicio(String correo, String contrasenia){
        this.correo=correo;
        this.contrasenia=contrasenia;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Open.browserOn(paginaInicioPage),
                Enter.theValue(correo).into(paginaInicioPage.CORREO),
                Enter.theValue(contrasenia).into(paginaInicioPage.CONTRASENIA),
                Click.on(paginaInicioPage.INICIO_SESION));

    }

    public static AbrirPaginaInicio laPaginaWeb(String correo, String contrasenia){
        return Tasks.instrumented(AbrirPaginaInicio.class,correo,contrasenia);
    }
}
