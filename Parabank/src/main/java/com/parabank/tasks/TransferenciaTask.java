package com.parabank.tasks;

import com.parabank.ui.NuevaCuentaUI;
import com.parabank.ui.TransferenciaUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TransferenciaTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("JC1").into(NuevaCuentaUI.TXT_USUARIO),
                Enter.theValue("1234").into(NuevaCuentaUI.TXT_CONTRASEÑA).thenHit(Keys.ENTER),
                Click.on(TransferenciaUI.BOTON_TRANSFERIRFONDOS),
                Enter.theValue("1234").into(TransferenciaUI.CANTIDAD),
                Click.on(TransferenciaUI.SELECCION_CUENTA),
                Click.on(TransferenciaUI.BOTON_TRANFERIR)
        );
    }

    public static Performable tranferiri(){
        return instrumented(TransferenciaTask.class);
    }
}
