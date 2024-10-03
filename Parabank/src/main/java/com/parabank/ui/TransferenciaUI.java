package com.parabank.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TransferenciaUI {
    public static final Target BOTON_TRANSFERIRFONDOS= Target.the("Botono de registro")
            .located(By.xpath("//a[@href='transfer.htm']"));

    public static final Target CANTIDAD= Target.the("Botono de registro")
            .located(By.xpath("//input[@id='amount']"));

    public static final Target SELECCION_CUENTA= Target.the("Botono de registro")
            .located(By.xpath("//select[@id='toAccountId']/option[@value='13677']"));

    public static final Target BOTON_TRANFERIR = Target.the("Botono de registro")
            .located(By.xpath("//input[@value='Transfer']"));
}
