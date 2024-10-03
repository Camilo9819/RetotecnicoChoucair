package com.parabank.tasks;

import com.parabank.ui.RegistroUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegistroTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(RegistroUI.BOTON_REGISTRARSE),
                Click.on(RegistroUI.BOTON_REGISTRARSE),
                Enter.theValue("Juan Camilo").into(RegistroUI.TXT_NOMBRE),
                Enter.theValue("Martinez").into(RegistroUI.TXT_APELLIDO),
                Enter.theValue("Calle 19 ").into(RegistroUI.TXT_DIRECCION),
                Enter.theValue("Ibague").into(RegistroUI.TXT_CIUDAD),
                Enter.theValue("Tolima").into(RegistroUI.TXT_DEPARTAMENTO),
                Enter.theValue("73001").into(RegistroUI.TXT_CODIGO),
                Enter.theValue("3124568799").into(RegistroUI.TXT_CELULAR),
                Enter.theValue("addsf").into(RegistroUI.TXT_SSN),
                Enter.theValue("Martinez11").into(RegistroUI.TXT_USUARIO),
                Enter.theValue("Camilo123").into(RegistroUI.TXT_CONTRASEÑA),
                Enter.theValue("Camilo123").into(RegistroUI.TXT_CONFIRMARCONTRASEÑA),
                Click.on(RegistroUI.BOTON_REGISTRARSE2)


        );
    }
    public static Performable registro(){
        return instrumented(RegistroTask.class);
    }
}
