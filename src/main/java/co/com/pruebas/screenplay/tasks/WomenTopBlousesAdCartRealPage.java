package co.com.pruebas.screenplay.tasks;


import co.com.pruebas.screenplay.ui.AutomationPracticeRealPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hover;

public class WomenTopBlousesAdCartRealPage implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.wasAbleTo(Hover.over(AutomationPracticeRealPage.WOMEN_BLOUSE));
        actor.wasAbleTo(Click.on(AutomationPracticeRealPage.WOMEN_TOPS_BLOUSES_ADD_CART));

    }

    public static WomenTopBlousesAdCartRealPage onEcommerce(){
        return Tasks.instrumented(WomenTopBlousesAdCartRealPage.class);
    }
}
