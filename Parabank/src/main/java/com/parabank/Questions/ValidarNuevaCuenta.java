package com.parabank.Questions;

import com.parabank.ui.ValidarCuentaNueva;
import com.parabank.ui.ValidarRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarNuevaCuenta implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return actor.asksFor(Text.of(ValidarCuentaNueva.H1_CUENTAEXITOSA));
    }

    public static ValidarNuevaCuenta mensaje(){
        return new ValidarNuevaCuenta() ;
    }
}
