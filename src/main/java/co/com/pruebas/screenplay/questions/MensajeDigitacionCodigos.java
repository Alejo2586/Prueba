package co.com.pruebas.screenplay.questions;

import co.com.pruebas.screenplay.ui.CodigosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class MensajeDigitacionCodigos implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return (Text.of(CodigosPage.MONEY_EARNED).viewedBy(actor).asString());
    }

    public static MensajeDigitacionCodigos esCorrecto() {
        return new MensajeDigitacionCodigos();
    }
}
