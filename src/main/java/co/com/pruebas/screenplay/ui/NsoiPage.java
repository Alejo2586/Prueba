package co.com.pruebas.screenplay.ui;

import com.gargoylesoftware.htmlunit.html.TableRowGroup;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://servicio.nuevosoi.com.co/soi/index.do?codigoBanco=07")
public class NsoiPage extends PageObject {
    public static final Target EMPRESA_TIPO_DCTO = Target.the("Tipo documento empresa").located(By.id("tipoIdEmpresa"));
    public static final Target EMPRESA_NRO_DCTO = Target.the("Número identificación empresa").located(By.id("idNumeroIdentificacionEmpresa"));
    public static final Target USUARIO_TIPO_DCTO= Target.the("Tipo documento usuario").located(By.id("tipoIdUsuario"));
    public static final Target USUARIO_NRO_DCTO = Target.the("Número identificación usuario").located(By.id("idNumeroIdentificacionEmpresa"));
    public static final Target CLAVE = Target.the("Número identificación usuario").located(By.id("idClaveUsuario"));
    public static final Target INGRESAR_BOTON = Target.the("Botón de ingresar").located(By.buttonText("Ingresar"));
}