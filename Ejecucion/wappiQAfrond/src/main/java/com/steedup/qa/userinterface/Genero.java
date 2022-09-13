package com.steedup.qa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.io.File;

import static org.aspectj.weaver.tools.cache.SimpleCacheFactory.path;


public class Genero {
    public static final Target GENERO = Target
            .the("Selecciona genero")
            .located(By.id("F"));

    }



