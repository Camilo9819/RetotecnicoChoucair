package com.parabank.stepDefinitions;

import com.parabank.Questions.ValidarRegistro;
import com.parabank.tasks.RegistroTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.CoreMatchers.equalTo;

public class Registro {
    String mensaje = "Your account was created successfully. You are now logged in.";
    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }
    @Dado("que el usuario ingresa a la pagina")
    public void queElUsuarioIngresaALaPagina() {
        theActorCalled("User").wasAbleTo(
                Open.url("https://parabank.parasoft.com/parabank/index.htm")
        );
    }
    @Cuando("el usaurio procede a realizar el proceso de registro")
    public void elUsaurioProcedeARealizarElProcesoDeRegistro() {
        theActorInTheSpotlight().attemptsTo(
                RegistroTask.registro()

        );
    }
    @Entonces("puede visualizar el mensaje de bienvenida")
    public void puedeVisualizarElMensajeDeBienvenida() {
        theActorInTheSpotlight().should(
                seeThat(
                        ValidarRegistro.mensaje(), equalTo(mensaje)
                )
        );
    }
}
