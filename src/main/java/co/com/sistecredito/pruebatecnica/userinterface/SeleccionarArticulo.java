package co.com.sistecredito.pruebatecnica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SeleccionarArticulo {

    public static final Target SELECCIONAR_ARTICULO =Target.the("Seleccionar articulo").
            located(By.xpath("//div[@class='jsx-3488318063 jsx-3886284353 pod-details pod-details-4_GRID']//span//b[contains(text(),'Tenis')]"));

}
