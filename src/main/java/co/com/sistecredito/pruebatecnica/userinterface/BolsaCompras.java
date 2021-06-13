package co.com.sistecredito.pruebatecnica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BolsaCompras {

    public static final Target VERBOLSA_COMPRA =Target.the("Ver bolsa de compras").
            located(By.id("linkButton"));

    public static final Target IR_A_COMPRAR =Target.the("Ir a comprar").
            located(By.xpath("//button[@class='fb-btn fb-btn-primary fb-btn-icon fb-order-status__continue-purchase js-fb-continue-purchase']"));


}

