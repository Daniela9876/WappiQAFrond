package com.steedup.qa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Information {
    public static final Target NAME = Target
            .the("Ingresar nombre")
            .located(By.xpath("//input[@id='name']"));
}
