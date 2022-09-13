package com.steedup.qa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Lastname {

    public static final Target LASTNAME = Target
            .the("Ingresar apellido")
            .located(By.xpath("//input[@id='lastName']"));

    public static final Target COUNTRY = Target
            .the("Ingresar pais")
            .located(By.xpath("//*[@id='country']//option[@value='2']"));

}
