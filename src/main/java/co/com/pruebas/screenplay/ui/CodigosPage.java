package co.com.pruebas.screenplay.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://aqmoney.club/")
public class CodigosPage extends PageObject {
    public static final Target USERNAME = Target.the("Usuario").located(By.id("username"));
    public static final Target PASSWORD = Target.the("Contraseña").located(By.id("password"));
    public static final Target LOGIN= Target.the("Login").located(By.xpath("/html/body/div/div[3]/div[1]/form/div[1]/input[3]"));
    public static final Target START= Target.the("Star").located(By.xpath("/html/body/div/div[2]/h2[2]/div/input"));
    public static final Target IMAGEN1=Target.the("Star").located(By.xpath("/html/body/div/div[2]/form/div[1]/table/tbody/tr/td[1]/div/img"));
    public static final Target IMAGEN2=Target.the("Star").located(By.xpath("/html/body/div/div[2]/form/div[1]/table/tbody/tr/td[2]/div/img"));
    public static final Target IMAGEN3=Target.the("Star").located(By.xpath("/html/body/div/div[2]/form/div[1]/table/tbody/tr/td[3]/div/img"));
    public static final Target TEXTO=Target.the("Texto").located(By.xpath("/html/body/div/div[2]/form/div[2]/input"));
    public static final Target CONTINUE=Target.the("Continuar").located(By.xpath("/html/body/div/div[2]/form/div[3]/input"));
    public static final Target MONEY_EARNED=Target.the("Dinero ganado").located(By.id("moneycount"));
}