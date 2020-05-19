package co.com.pruebas.screenplay.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://euno.lms.doctustest.com/")
public class PaginaInicioPage extends PageObject {
    public static final Target CORREO = Target.the("Correo").located(By.id("Email"));
    public static final Target CONTRASENIA = Target.the("Contraseña").located(By.id("Password"));
    public static final Target INICIO_SESION= Target.the("Enviar").located(By.id("btnLogin"));
    public static final Target VALIDACION= Target.the("Validacion").located(By.xpath("/html/body/div[1]/div[4]/div/form/div[1]"));
}