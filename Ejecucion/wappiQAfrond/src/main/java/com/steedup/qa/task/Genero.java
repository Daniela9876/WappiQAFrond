package com.steedup.qa.task;

import com.steedup.qa.models.Datafecha;
import com.steedup.qa.models.Datagenero;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static com.steedup.qa.userinterface.Genero.GENERO;

public class Genero implements Task {
    private Datagenero datagenero;
    public Genero(Datagenero datagenero){
        this.datagenero = datagenero;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(GENERO));
    }

    public static Genero withData(Datagenero datagenero){
        return new Genero(datagenero);
    }
}
