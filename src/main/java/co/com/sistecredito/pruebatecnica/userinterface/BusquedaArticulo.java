package co.com.sistecredito.pruebatecnica.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class BusquedaArticulo {
    public static final Target AVISO_IMPORTANTE =Target.the("Aviso importante").
            located(By.id("fake-close"));

    public static final Target BUSQUEDA =Target.the("Busqueda").
            located(By.id("testId-SearchBar-Input"));

    public static final Target TALLA =Target.the("Talla").
            located(By.id("testId-sizeButton-40"));

    public static final Target AVISO_CMR =Target.the("Aviso CMR").
            located(By.xpath("//div[@class='dy-lb-close']"));

    public static final Target AGREGAR_BOLSA =Target.the("Agregar a la bolsa").
            located(By.id("buttonForCustomers"));




}
