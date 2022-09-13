package com.steedup.qa.task;

import com.steedup.qa.models.DataLastname;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.steedup.qa.userinterface.Lastname.COUNTRY;
import static com.steedup.qa.userinterface.Lastname.LASTNAME;

public class Lastname implements Task {

    private DataLastname dataLastname;
    public Lastname(DataLastname dataLastname){
        this.dataLastname = dataLastname;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(dataLastname.getLastname()).into(LASTNAME));
        actor.attemptsTo(Click.on(COUNTRY));

    }
    public static Lastname withData(DataLastname dataLastname){
        return new Lastname(dataLastname);
    }
}
