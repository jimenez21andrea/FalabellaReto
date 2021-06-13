package co.com.sistecredito.pruebatecnica.tasks;
import co.com.sistecredito.pruebatecnica.Models.Objetos;
import co.com.sistecredito.pruebatecnica.userinterface.BolsaCompras;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;


public class Comprar implements Task {

    private List<Objetos> data;

    public Comprar(List<Objetos> data) {
        this.data = data;
    }

    public static Comprar elArticulo(List<Objetos> objetosList) {

        return Tasks.instrumented(Comprar.class, objetosList);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BolsaCompras.VERBOLSA_COMPRA),
                Click.on(BolsaCompras.IR_A_COMPRAR),
                OpcionesDespacho.deLaCompra(data)

        );
    }

}
