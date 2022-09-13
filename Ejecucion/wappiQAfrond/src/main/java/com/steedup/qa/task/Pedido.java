package com.steedup.qa.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.steedup.qa.userinterface.Pedido.*;

public class Pedido implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ORDER_PEDIR));
        actor.attemptsTo(Click.on(CONFIRM_ORDER));
        actor.attemptsTo(Click.on(CLICK_CLOSE));
        actor.attemptsTo(Click.on(CLICK_PEDIDOS));
        actor.attemptsTo(Click.on(CLICK_INFORMATION));
    }

    public static Pedido pedido() {
        return Tasks.instrumented(Pedido.class);
    }
}
