package com.choucairtesting.tasks;

import com.choucairtesting.userinterfaces.ButtonPage;
import com.choucairtesting.userinterfaces.LabelPage;
import com.choucairtesting.userinterfaces.MenuPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.List;

public class JobPortal implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MenuPage.MENU_EMPLEOS),
                Scroll.to(LabelPage.CHOUCAIR_LABEL),
                Click.on(ButtonPage.PORTAL_BUTTON),
                Click.on(ButtonPage.FOLLOW));
    }

    public static JobPortal jobPortal() {

        return Tasks.instrumented(JobPortal.class);
    }

}


