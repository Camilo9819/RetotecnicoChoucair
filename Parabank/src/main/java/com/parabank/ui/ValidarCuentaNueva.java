package com.parabank.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidarCuentaNueva {
    public static final Target H1_CUENTAEXITOSA = Target.the("")
            .located(By.xpath("//p[normalize-space()='Congratulations, your account is now open.']"));
}
