package co.com.sistecredito.pruebatecnica.tasks;

import co.com.sistecredito.pruebatecnica.Models.Objetos;
import co.com.sistecredito.pruebatecnica.Utils.Constantes;
import co.com.sistecredito.pruebatecnica.userinterface.LlenarDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.questions.SelectOptions;

import java.security.PublicKey;
import java.util.List;

public class OpcionesDespacho implements Task {

    private List<Objetos> data;

    public OpcionesDespacho(List<Objetos> data) {
        this.data = data;
    }
    public static OpcionesDespacho deLaCompra (List<Objetos> objetosList){

        return Tasks.instrumented(OpcionesDespacho.class, objetosList);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {

 Objetos Info = data.get(Constantes.ZERO);

 actor.attemptsTo(
         SelectFromOptions.byVisibleText(Info.getDepartamento()).from(LlenarDatos.DEPARTAMENTO),
         SelectFromOptions.byVisibleText(Info.getCiudad()).from(LlenarDatos.CIUDAD),
         SelectFromOptions.byVisibleText(Info.getCiudad()).from(LlenarDatos.BARRIO),
        Click.on(LlenarDatos.BTN_CONTINUAR),
         Enter.theValue(Info.getDireccion()).into(LlenarDatos.DIRECCION),
         Enter.theValue(Info.getDireccion()).into(LlenarDatos.TORRE),
         Click.on(LlenarDatos.CONTINUAR),
         Click.on(LlenarDatos.CONTINUAR_PAGO)



 );

    }

    }

