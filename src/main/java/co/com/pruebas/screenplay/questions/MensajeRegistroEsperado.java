package co.com.pruebas.screenplay.questions;

import co.com.pruebas.screenplay.ui.PaginaRegistroPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.questions.Text;

public class MensajeRegistroEsperado implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return (Text.of(PaginaRegistroPage.VALIDACION).viewedBy(actor).asString());
    }

    public static MensajeRegistroEsperado esCorrecto() {
        return new MensajeRegistroEsperado();
    }
}
