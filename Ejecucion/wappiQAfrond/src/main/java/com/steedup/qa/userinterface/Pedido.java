package com.steedup.qa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Pedido {
    public static final Target ORDER_PEDIR = Target
            .the("Clic en boton pedir")
            .located(By.xpath("//*[@id='offer-0']//*[@class='align-center']"));

    public static final Target CONFIRM_ORDER = Target
            .the("Clic en boton confirmar orden")
            .located(By.id("order-confirm"));
    public static final Target CLICK_CLOSE = Target
            .the("Clic para cerrar mensaje de confirmacion")
            .located(By.xpath("(//*[@class='modal-content']//span[@class='close'])[3]"));

    public static final Target CLICK_PEDIDOS = Target
            .the("Clic para ir a pedidos")
            .located(By.xpath("(//*[@class='nav-bar']//*[@class='nav-bar-link'])[2]"));


    public static final Target CLICK_INFORMATION = Target
            .the("Clic en informacion personal")
            .located(By.xpath("(//*[@class='nav-bar']//*[@class='nav-bar-link'])[3]"));

}
