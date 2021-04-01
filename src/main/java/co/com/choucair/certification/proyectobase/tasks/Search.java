package co.com.choucair.certification.proyectobase.tasks;

import static co.com.choucair.certification.proyectobase.userinterface.SearchJobPage.*;

import co.com.choucair.certification.proyectobase.model.JobChoucairData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Search implements Task {

    JobChoucairData jobChoucairData;

    public Search(JobChoucairData jobChoucairData) {
        this.jobChoucairData = jobChoucairData;
    }

    public static Search the(JobChoucairData jobData) {
        return Tasks.instrumented(Search.class, jobData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_COOKIE),
                Enter.theValue(jobChoucairData.getStrJob()).into(INPUT_JOB),
                Enter.theValue(jobChoucairData.getStrCity()).into(INPUT_CITY),
                Click.on(BUTTON_SEARCH_JOB),
                Click.on(SELECT_JOB_OPTION)
        );
    }
}
