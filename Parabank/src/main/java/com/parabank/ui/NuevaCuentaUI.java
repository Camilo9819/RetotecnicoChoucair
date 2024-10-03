package com.parabank.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NuevaCuentaUI {
    public static final Target TXT_USUARIO = Target.the("Botono de registro")
            .located(By.xpath("//input[@name='username']"));
    public static final Target TXT_CONTRASEÑA = Target.the("Botono de registro")
            .located(By.xpath("//input[@name='password']"));

    public static final Target BOTON_INGRESAR = Target.the("Botono de registro")
            .located(By.xpath("//input[@name='Log In']"));

    public static final Target BOTON_NUEVACUENTA= Target.the("Botono de registro")
            .located(By.xpath("//a[@href='openaccount.htm']"));


    public static final Target SELECCION_TIPOCUENTA= Target.the("Botono de registro")
            .located(By.xpath("//select[@id='type']/option[@value='1']"));

    public static final Target BOTON_ABRIRNUEVACUENTA = Target.the("Botono de registro")
            .located(By.xpath("//input[@value='Open New Account']"));



}
