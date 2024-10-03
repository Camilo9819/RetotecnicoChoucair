package com.parabank.tasks;

import com.parabank.ui.NuevaCuentaUI;
import com.parabank.ui.RegistroUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NuevaCuentaTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        Enter.theValue("JC").into(NuevaCuentaUI.TXT_USUARIO),
        Enter.theValue("1234").into(NuevaCuentaUI.TXT_CONTRASEÑA).thenHit(Keys.ENTER),
        Click.on(NuevaCuentaUI.BOTON_NUEVACUENTA),
        Click.on(NuevaCuentaUI.SELECCION_TIPOCUENTA),
        Click.on(NuevaCuentaUI.BOTON_ABRIRNUEVACUENTA)
        );
    }

    public static Performable nuevaCuenta(){
        return instrumented(NuevaCuentaTask.class);
    }
}
