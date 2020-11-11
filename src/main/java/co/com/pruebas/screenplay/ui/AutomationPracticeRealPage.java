package co.com.pruebas.screenplay.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com/")
public class AutomationPracticeRealPage extends PageObject {
    public static final Target WOMEN = Target.the("WomenTag").located(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a"));
    public static final Target WOMEN_TOPS = Target.the("WomenTopTag").located(By.xpath("/html/body/div/div[2]/div/div[3]/div[1]/div[1]/div/ul/li[1]/a"));
    public static final Target WOMEN_TOPS_BLOUSES = Target.the("WomenTopTag").located(By.xpath("/html/body/div/div[2]/div/div[3]/div[1]/div[1]/div/ul/li[2]/a"));
    public static final Target WOMEN_BLOUSE=        Target.the("Image").located(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div"));
    public static final Target WOMEN_TOPS_BLOUSES_ADD_CART = Target.the("WomenTopTag").located(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/div[2]/a[1]/span"));
    public static final Target CONTINUE_SHOPPING = Target.the("WomenTopTag").located(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span/span"));
    public static final Target VALIDATION = Target.the("WomenTopTag").located(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a"));

}