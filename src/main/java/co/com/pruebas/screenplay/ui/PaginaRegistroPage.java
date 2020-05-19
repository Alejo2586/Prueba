package co.com.pruebas.screenplay.ui;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.annotations.findby.By;

@DefaultUrl("https://euno.lms.doctustest.com/Public/User/UserRegister")
public class PaginaRegistroPage extends PageObject {
    public static final Target NOMBRE = Target.the("Nombre").located(By.xpath("/html/body/div[1]/div[4]/div/form/div[1]/div[2]/input"));
    public static final Target APELLIDO = Target.the("Apellido").located(By.xpath("/html/body/div[1]/div[4]/div/form/div[1]/div[3]/input"));
    public static final Target CEDULA = Target.the("Cedula").located(By.xpath("/html/body/div[1]/div[4]/div/form/div[1]/div[4]/input"));
    public static final Target CORREO = Target.the("Correo").located(By.xpath("/html/body/div[1]/div[4]/div/form/div[1]/div[5]/input"));
    public static final Target CONF_CORREO = Target.the("Conf correo").located(By.xpath("/html/body/div[1]/div[4]/div/form/div[1]/div[6]/input"));
    public static final Target CONTRASENIA = Target.the("Contraseña").located(By.xpath("/html/body/div[1]/div[4]/div/form/div[1]/div[7]/input"));
    public static final Target CONF_CONTRASENIA = Target.the("Conf Contraseña").located(By.xpath("/html/body/div[1]/div[4]/div/form/div[1]/div[8]/input"));
    public static final Target TERM_Y_COND = Target.the("Terminos y condiciones").located(By.xpath("/html/body/div[1]/div[4]/div/form/div[2]/div/label/input"));
    public static final Target ENVIAR= Target.the("Enviar").located(By.id("btnLogin"));
    public static final Target VALIDACION= Target.the("Validacion").located(By.id("register-login"));
}