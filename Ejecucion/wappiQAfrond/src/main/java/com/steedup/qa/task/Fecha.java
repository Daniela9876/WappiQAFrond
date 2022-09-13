package com.steedup.qa.task;

import com.steedup.qa.models.DataInformation;
import com.steedup.qa.models.Datafecha;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static com.steedup.qa.userinterface.Fecha.FECHA;
import static com.steedup.qa.userinterface.Information.NAME;


public class Fecha implements Task {
    private Datafecha datafecha;
    public Fecha(Datafecha datafecha){
        this.datafecha = datafecha;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datafecha.getFecha()).into(FECHA));
    }
    public static Fecha withData(Datafecha datafecha){
        return new Fecha(datafecha);
    }
}
