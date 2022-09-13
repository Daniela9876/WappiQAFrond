package com.steedup.qa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login {

    public static final Target READ_USER = Target
            .the("Escribir usuario")
            .located(By.xpath("//input[@id='username']"));
    public static final Target READ_PASSWORD = Target
            .the("Escribir password")
            .located(By.xpath("//input[@id='password']"));

    public static final Target LOGIN_BUTTON = Target
            .the("Escribir password")
            .located(By.id("button-login"));

}
