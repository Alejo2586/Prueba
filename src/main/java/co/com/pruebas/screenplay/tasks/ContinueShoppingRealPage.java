package co.com.pruebas.screenplay.tasks;


import co.com.pruebas.screenplay.ui.AutomationPracticeRealPage;
import co.com.pruebas.screenplay.ui.PaginaInicioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ContinueShoppingRealPage implements Task {

    private PaginaInicioPage paginaInicioPage;


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Click.on(AutomationPracticeRealPage.CONTINUE_SHOPPING));

    }

    public static ContinueShoppingRealPage onEcommerce(){
        return Tasks.instrumented(ContinueShoppingRealPage.class);
    }
}
