package com.parabank.Questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class ValidarRegistro implements Question<String> {
    @Override
    public String  answeredBy(Actor actor) {
        return actor.asksFor(Text.of(com.parabank.ui.ValidarRegistro.H1_REGISTROEXITOSO));

    }

    public static ValidarRegistro mensaje(){
        return new ValidarRegistro() ;
    }
}
