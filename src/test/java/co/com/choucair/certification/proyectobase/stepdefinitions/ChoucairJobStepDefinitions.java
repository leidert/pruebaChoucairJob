package co.com.choucair.certification.proyectobase.stepdefinitions;
import co.com.choucair.certification.proyectobase.model.JobChoucairData;
import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.Apply;
import co.com.choucair.certification.proyectobase.tasks.Enter;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import co.com.choucair.certification.proyectobase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairJobStepDefinitions {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("^which (.*) wants to submit their Analista de Pruebas resume on the choucair page$")
    public void whichLeiderWantsToSubmitTheirAutomatizerResumeOnTheChoucairPage(String leider) {
        theActorCalled(leider).wasAbleTo(OpenUp.thePage(), Enter.onTheSection());
    }

    @When("^leider enter search data$")
    public void leiderEnterSearchData(List<JobChoucairData> jobData) {
        theActorInTheSpotlight().attemptsTo(Search.the(jobData.get(0)));

    }

    @When("^register to send the resume$")
    public void registerToSendTheResume(List<JobChoucairData> jobData) {
        theActorInTheSpotlight().attemptsTo(Apply.toWork(jobData.get(0)));
    }

    @Then("^He verifies the (.*) on the screen$")
    public void heVerifiesTheAutomatizadorOnTheScreen(String message) {
        theActorInTheSpotlight().should(seeThat(Answer.toThen(message)));
    }

}
