package co.com.pruebas.screenplay.questions;

import co.com.pruebas.screenplay.ui.AutomationPracticeRealPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ReturnHomePage implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return (Text.of(AutomationPracticeRealPage.VALIDATION).viewedBy(actor).asString());
    }

    public static ReturnHomePage hasOneProduct() {
        return new ReturnHomePage();
    }
}
