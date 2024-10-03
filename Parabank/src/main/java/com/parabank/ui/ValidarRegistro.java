package com.parabank.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidarRegistro {



    public static final Target H1_REGISTROEXITOSO = Target.the("Texto registro exitoso")
            .located(By.xpath("//p[contains(text(),'Your account was created successfully. You are now logged in.')]"));
}
