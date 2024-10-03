package com.parabank.stepDefinitions;

import com.parabank.Questions.ValidarNuevaCuenta;
import com.parabank.tasks.NuevaCuentaTask;
import com.parabank.tasks.RegistroTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class NuevaCuenta {

    String mensaje = "Congratulations, your account is now open.";

    @Cuando("el usaurio se logea y  procede a realizar la creacion de la cuenta nueva")
    public void elUsaurioSeLogeaYProcedeARealizarLaCreacionDeLaCuentaNueva() {
        theActorInTheSpotlight().attemptsTo(
                NuevaCuentaTask.nuevaCuenta()

        );
    }
    @Entonces("puede visualizar el mensaje de que fue creada exitosamente")
    public void puedeVisualizarElMensajeDeQueFueCreadaExitosamente() {
        theActorInTheSpotlight().should(
                seeThat(ValidarNuevaCuenta.mensaje(), equalTo(mensaje))
        );
    }
}
