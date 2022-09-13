package com.steedup.qa.task;

import com.steedup.qa.models.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.steedup.qa.userinterface.Login.*;

public class Login implements Task {

    private Data data;

    public Login(Data data){
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.getUser()).into(READ_USER));
        actor.attemptsTo(Enter.theValue(data.getUser()).into(READ_PASSWORD));
        actor.attemptsTo(Click.on(LOGIN_BUTTON));
    }

    public static Login withData(Data data){
        return new Login(data);

    }
}
