package co.com.pruebas.screenplay.tasks;


import co.com.pruebas.screenplay.ui.SmartFormularioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class FormularioDatosBasicosSmartClases implements Task {

    private SmartFormularioPage smartFormularioPage;
    private String email;
    private String codigoEstudiante;
    private String nombreApellidos;
    private String celular;

    public FormularioDatosBasicosSmartClases(String email,String codigoEstudiante,String nombreApellidos,String celular){
        this.email=email;
        this.codigoEstudiante=codigoEstudiante;
        this.nombreApellidos=nombreApellidos;
        this.celular=celular;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Open.browserOn(smartFormularioPage));
        actor.wasAbleTo(Enter.theValue(email).into(smartFormularioPage.EMAIL));
        actor.wasAbleTo(Enter.theValue(codigoEstudiante).into(smartFormularioPage.CODIGO_ESTUDIANTE));
        actor.wasAbleTo(Enter.theValue(nombreApellidos).into(smartFormularioPage.NOMBRE));
        actor.wasAbleTo(Enter.theValue(celular).into(smartFormularioPage.NUMERO_TELEFONICO));
        actor.wasAbleTo(Click.on(smartFormularioPage.SIGUIENTE_DATOS_BASICOS));

    }

    public static FormularioDatosBasicosSmartClases paraColocar(String email,String codigoEstudiante,String nombreApellidos,String celular){
        return Tasks.instrumented(FormularioDatosBasicosSmartClases.class,email,codigoEstudiante,nombreApellidos,celular);
    }
}
