package co.com.sistecredito.pruebatecnica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class VerificarPago {

    public static final Target VERIFICAR_PAGO =Target.the("Verificar pago").
            located(By.xpath("//span[contains(text (),'Pago')][1]"));

}
