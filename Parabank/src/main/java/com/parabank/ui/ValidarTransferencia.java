package com.parabank.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidarTransferencia {


    public static final Target H1_TRANFERENCIA_COMPLETA= Target.the("")
            .located(By.xpath("//h1[normalize-space()='Transfer Complete!']"));
}
