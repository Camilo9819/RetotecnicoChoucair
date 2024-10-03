package com.parabank.stepDefinitions;

import com.parabank.Questions.ValidarRegistro;
import com.parabank.Questions.ValidarTransferencia;
import com.parabank.tasks.NuevaCuentaTask;
import com.parabank.tasks.TransferenciaTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class Transferencia {

    String mensaje = "Transfer Complete!";

    @Cuando("el usaurio se logea y  procede a realizar la transferencia de fondos")
    public void elUsaurioSeLogeaYProcedeARealizarLaTransferenciaDeFondos() {
        theActorInTheSpotlight().attemptsTo(
                TransferenciaTask.tranferiri()

        );
    }
    @Entonces("puede visualizar el mensaje de transaccion exitosa")
    public void puedeVisualizarElMensajeDeTransaccionExitosa() {
        theActorInTheSpotlight().should(
                seeThat(
                        ValidarTransferencia.mensaje(), equalTo(mensaje)
                )
        );
    }
}
