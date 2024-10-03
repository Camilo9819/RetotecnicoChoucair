package com.parabank.Questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarTransferencia implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return actor.asksFor(Text.of(com.parabank.ui.ValidarTransferencia.H1_TRANFERENCIA_COMPLETA));
    }

    public static ValidarRegistro mensaje(){
        return new ValidarRegistro() ;
    }
}
