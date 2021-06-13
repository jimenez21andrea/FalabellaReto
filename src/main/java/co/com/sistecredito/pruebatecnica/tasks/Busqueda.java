package co.com.sistecredito.pruebatecnica.tasks;

import co.com.sistecredito.pruebatecnica.userinterface.BusquedaArticulo;
import co.com.sistecredito.pruebatecnica.userinterface.SeleccionarArticulo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

public class Busqueda implements Task {

    public Busqueda(String articulo) {
        this.articulo = articulo;
    }

    private String articulo;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                CerrarAvisos.enLaPagina(),
                Enter.theValue(articulo).into(BusquedaArticulo.BUSQUEDA).thenHit(Keys.ENTER),
                Click.on(SeleccionarArticulo.SELECCIONAR_ARTICULO),
                Click.on(BusquedaArticulo.TALLA),
                WaitUntil.the(BusquedaArticulo.AVISO_CMR,  WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Click.on(BusquedaArticulo.AVISO_CMR),
                Click.on(BusquedaArticulo.AGREGAR_BOLSA)
        );

    }

    public static Busqueda delArticulo(String articulo) {
        return Tasks.instrumented(Busqueda.class,articulo);
    }
}
