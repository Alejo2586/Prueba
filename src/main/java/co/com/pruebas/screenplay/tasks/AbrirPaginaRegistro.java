package co.com.pruebas.screenplay.tasks;


import co.com.pruebas.screenplay.ui.PaginaRegistroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPaginaRegistro implements Task {

    private PaginaRegistroPage paginaRegistroPage;
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasenia;
    private String cedula;

    public AbrirPaginaRegistro(String nombre, String apellido, String correo, String contrasenia, String cedula){
        this.nombre=nombre;
        this.apellido=apellido;
        this.correo=correo;
        this.contrasenia=contrasenia;
        this.cedula=cedula;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Open.browserOn(paginaRegistroPage),
                Enter.theValue(nombre).into(paginaRegistroPage.NOMBRE),
                Enter.theValue(apellido).into(paginaRegistroPage.APELLIDO),
                Enter.theValue(cedula).into(paginaRegistroPage.CEDULA),
                Enter.theValue(correo).into(paginaRegistroPage.CORREO),
                Enter.theValue(correo).into(paginaRegistroPage.CONF_CORREO),
                Enter.theValue(contrasenia).into(paginaRegistroPage.CONTRASENIA),
                Enter.theValue(contrasenia).into(paginaRegistroPage.CONF_CONTRASENIA),
                Click.on(paginaRegistroPage.TERM_Y_COND),
                Click.on(paginaRegistroPage.ENVIAR));

    }

    public static AbrirPaginaRegistro laPaginaWeb(String nombre, String apellido, String correo, String contrasenia, String cedula){
        return Tasks.instrumented(AbrirPaginaRegistro.class,nombre,apellido,correo,contrasenia,cedula);
    }
}
