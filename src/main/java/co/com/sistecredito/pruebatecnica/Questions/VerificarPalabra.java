package co.com.sistecredito.pruebatecnica.Questions;

import co.com.sistecredito.pruebatecnica.userinterface.VerificarPago;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.sistecredito.pruebatecnica.userinterface.VerificarPago.VERIFICAR_PAGO;

public class VerificarPalabra implements Question<Boolean> {

    String palabra;

    public VerificarPalabra(String palabra) {
        this.palabra = palabra;
    }

    public static VerificarPalabra es(String pagoOK) {
        return new VerificarPalabra(pagoOK);
    }


    @Override
    public Boolean answeredBy(Actor actor) {

        String texto= Text.of(VERIFICAR_PAGO).viewedBy(actor).asString();
        return palabra.equals(texto);

    }
}
