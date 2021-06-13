package co.com.sistecredito.pruebatecnica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LlenarDatos {

    public static final Target DEPARTAMENTO =Target.the("Departamento").
            located(By.id("region"));

    public static final Target CIUDAD =Target.the("Ciudad").
            located(By.id("ciudad"));

    public static final Target BARRIO=Target.the("Barrio").
            located(By.id("comuna"));

    public static final Target  BTN_CONTINUAR=Target.the("Continuar").
            located(By.xpath("//button[@class='fbra_button fbra_test_button fbra_formItem__field04']"));

    public static final Target DIRECCION=Target.the("Direccion").
            located(By.id("address"));

    public static final Target TORRE=Target.the("Torre").
            located(By.id("departmentNumber"));

    public static final Target CONTINUAR=Target.the("Torre").
            located(By.xpath("//button[@class='fbra_button fbra_test_button fbra_formItem__useAddress']"));


    public static final Target CONTINUAR_PAGO=Target.the("ContinuarPago").
            located(By.xpath("//button[@class='fbra_button fbra_checkoutComponentDeliveryActions__continueToSecurePaymentButton fbra_test_checkoutComponentDeliveryActions__continueToSecurePaymentButton']"));








}
