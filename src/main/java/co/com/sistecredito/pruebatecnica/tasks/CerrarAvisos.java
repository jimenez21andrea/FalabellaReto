package co.com.sistecredito.pruebatecnica.tasks;

import co.com.sistecredito.pruebatecnica.userinterface.BusquedaArticulo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class CerrarAvisos implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(

            Click.on(BusquedaArticulo.AVISO_IMPORTANTE)
    );
    }


    public static   CerrarAvisos enLaPagina () {
        return Tasks.instrumented(CerrarAvisos.class);
    }

}
