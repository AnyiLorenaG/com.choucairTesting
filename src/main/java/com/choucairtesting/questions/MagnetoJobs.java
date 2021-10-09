package com.choucairtesting.questions;

import com.choucairtesting.userinterfaces.LabelPage;
import com.choucairtesting.userinterfaces.MenuPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class MagnetoJobs implements Question {

    public static MagnetoJobs toThe() {
        return new MagnetoJobs();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(LabelPage.MESSAGE_LABEL).viewedBy(actor).asString();
    }
}
