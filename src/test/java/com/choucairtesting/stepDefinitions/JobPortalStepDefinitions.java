package com.choucairtesting.stepDefinitions;

import com.choucairtesting.questions.MagnetoJobs;
import com.choucairtesting.tasks.JobPortal;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class JobPortalStepDefinitions {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("user");
    }

    @Given("^That users  needs to enter the page choucair$")
    public void thatUsersNeedsToEnterThePageChoucair() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.choucairtesting.com/"));
    }

    @When("^enter the jobs section and click on the job portal button and agree to continue$")
    public void enterTheJobsSectionAndClickOnTheJobPortalButtonAndAgreeToContinue() {
        theActorInTheSpotlight().attemptsTo(JobPortal.jobPortal());
    }

    @Then("^see that it redirects us to the magneto page (.*)$")
    public void seeThatItRedirectsUsToTheMagnetoPageMagnetoEmpleos(String message) {
        theActorInTheSpotlight().should(GivenWhenThen
                .seeThat(MagnetoJobs.toThe(), Matchers.equalTo(message)));
    }
}



