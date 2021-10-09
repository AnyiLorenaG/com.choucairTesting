package com.choucairtesting.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LabelPage {

    public static final Target CHOUCAIR_LABEL = Target.the("click menu option empleos").locatedBy("//a[contains(text(),'Prepararse para aplicar')]");

    public static final Target MESSAGE_LABEL = Target.the("Message").locatedBy("//a[contains(text(),'Magneto Empleos')]");

}
