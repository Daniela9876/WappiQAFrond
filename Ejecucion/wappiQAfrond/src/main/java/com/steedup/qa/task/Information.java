package com.steedup.qa.task;

import com.steedup.qa.models.DataInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static com.steedup.qa.userinterface.Information.*;

public class Information implements Task {
    private DataInformation dataInformation;
    public Information(DataInformation dataInformation){
        this.dataInformation = dataInformation;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(dataInformation.getName()).into(NAME));
    }
    public static Information withData(DataInformation dataInformation){
        return new Information(dataInformation);
    }

}
