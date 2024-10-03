package com.parabank.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroUI {

    public static final Target BOTON_REGISTRARSE = Target.the("Botono de registro")
            .located(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a"));
    public static final Target TXT_NOMBRE = Target.the("Textear el nombre")
            .located(By.xpath("//input[@id='customer.firstName']"));

    public static final Target TXT_APELLIDO = Target.the("Botono de registro")
            .located(By.xpath("//input[@id='customer.lastName']"));

    public static final Target TXT_DIRECCION = Target.the("Botono de registro")
            .located(By.xpath("//input[@id='customer.address.street']"));

    public static final Target TXT_CIUDAD = Target.the("Botono de registro")
            .located(By.xpath("//input[@id='customer.address.city']"));

    public static final Target TXT_DEPARTAMENTO = Target.the("Botono de registro")
            .located(By.xpath("//input[@id='customer.address.state']"));

    public static final Target TXT_CODIGO = Target.the("Botono de registro")
            .located(By.xpath("//input[@id='customer.address.zipCode']"));

    public static final Target TXT_CELULAR = Target.the("Botono de registro")
            .located(By.xpath("//input[@id='customer.phoneNumber']"));

    public static final Target TXT_SSN = Target.the("Botono de registro")
            .located(By.xpath("//input[@id='customer.ssn']"));

    public static final Target TXT_USUARIO = Target.the("Botono de registro")
            .located(By.xpath("//input[@id='customer.username']"));

    public static final Target TXT_CONTRASEÑA = Target.the("Botono de registro")
            .located(By.xpath("//input[@id='customer.password']"));

    public static final Target TXT_CONFIRMARCONTRASEÑA = Target.the("Botono de registro")
            .located(By.xpath("//input[@id='repeatedPassword']"));

    public static final Target BOTON_REGISTRARSE2 = Target.the("Botono de registro")
            .located(By.xpath("//input[@value='Register']"));


}
