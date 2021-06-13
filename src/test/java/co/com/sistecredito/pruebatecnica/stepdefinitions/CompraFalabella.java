package co.com.sistecredito.pruebatecnica.stepdefinitions;

import co.com.sistecredito.pruebatecnica.Models.Objetos;
import co.com.sistecredito.pruebatecnica.Questions.VerificarPalabra;
import co.com.sistecredito.pruebatecnica.tasks.Busqueda;
import co.com.sistecredito.pruebatecnica.tasks.CerrarAvisos;
import co.com.sistecredito.pruebatecnica.tasks.Comprar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.util.List;

public class CompraFalabella {


    @Managed(driver="chrome")
    WebDriver hisdriver;

    Actor Andrea = Actor.named("Andrea");

    @Before
    public void setup() {
        Andrea.can(BrowseTheWeb.with(hisdriver));
    }


    @Dado("^que el usuario ingresa a la pagina de falabella$")
    public void queElUsuarioIngresaALaPaginaDeFalabella() {
        Andrea.wasAbleTo(Open.url("https://www.falabella.com.co/falabella-co"));

    }


    @Cuando("^el usuario elige comprar el producto (.*)$")
    public void elUsuarioEligeComprarElProducto(String articulo) {
        Andrea.attemptsTo(Busqueda.delArticulo(articulo));


    }

    @Cuando("^llena la informacion necesaria en la bolsa de compras$")
    public void llenaLaInformacionNecesariaEnLaBolsaDeCompras(List<Objetos> data) {

        Andrea.attemptsTo(Comprar.elArticulo(data));

    }

    @Entonces("^el usuario verifica que llego hasta el (.*)$")
    public void elUsuarioVerificaQueLlegoHastaEl(String PagoOK) {
       // theActorInTheSpotlight().should(seeThat(VerificarPalabra.es(PagoOK)));
        Andrea.should(seeThat(VerificarPalabra.es(PagoOK)));
    }
}
