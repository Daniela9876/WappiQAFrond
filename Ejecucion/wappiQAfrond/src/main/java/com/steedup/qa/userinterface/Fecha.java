package com.steedup.qa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Fecha {
    public static final Target FECHA = Target
            .the("Ingresar Fecha")
            .located(By.xpath("//input[@id='bornDate']"));

}
