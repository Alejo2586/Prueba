package co.com.pruebas.screenplay.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://docs.google.com/forms/d/e/1FAIpQLSfyNREySHya4IaCT0EGpHaZs_STibhSljYpD5NTk_7ek1xktg/viewform")
public class SmartFormularioPage extends PageObject {
    public static final Target EMAIL = Target.the("Correo electrónico").located(By.xpath("/html/body/div/div[2]/form/div[2]/div/div[2]/div[1]/div[1]/div[2]/div[1]/div/div[1]/input"));
    public static final Target CODIGO_ESTUDIANTE = Target.the("Código estudiante").located(By.xpath("/html/body/div/div[2]/form/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[1]/input"));
    public static final Target NOMBRE = Target.the("Nombres y apellidos").located(By.xpath("/html/body/div/div[2]/form/div[2]/div/div[2]/div[3]/div/div/div[2]/div/div[1]/div/div[1]/input"));
    public static final Target NUMERO_TELEFONICO = Target.the("Nombres y apellidos").located(By.xpath("/html/body/div/div[2]/form/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div[1]/div/div[1]/input"));
    public static final Target SIGUIENTE_DATOS_BASICOS = Target.the("Siguiente").located(By.xpath("/html/body/div/div[2]/form/div[2]/div/div[3]/div[1]/div/div/span"));
    public static final Target CLASE_VIRTUAL = Target.the("Siguiente").located(By.xpath("/html/body/div/div[2]/form/div[2]/div/div[2]/div[3]/div/div/div[2]/div/div/span/div/div[1]/label/div/div[1]/div/div[3]/div"));
    public static final Target QUIZ_INGLES = Target.the("Siguiente").located(By.xpath("/html/body/div/div[2]/form/div[2]/div/div[2]/div[3]/div/div/div[2]/div/div/span/div/div[7]/label/div/div[1]/div/div[3]/div"));

    // /html/body/div/div[2]/form/div[2]/div/div[2]/div[3]/div/div/div[2]/div/div/span/div/div[1]/label/div/div[1]/div/div[3]/div


}