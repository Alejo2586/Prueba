package co.com.pruebas.screenplay.questions;

import co.com.pruebas.screenplay.ui.PaginaInicioPage;
import co.com.pruebas.screenplay.ui.PaginaRegistroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class MensajeInicioSesionEsperado implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return (Text.of(PaginaInicioPage.VALIDACION).viewedBy(actor).asString());
    }

    public static MensajeInicioSesionEsperado esCorrecto() {
        return new MensajeInicioSesionEsperado();
    }
}
