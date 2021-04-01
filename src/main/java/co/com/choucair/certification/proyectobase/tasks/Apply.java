package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.model.JobChoucairData;
import static co.com.choucair.certification.proyectobase.userinterface.ChoucairApplyPage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Apply implements Task {
    JobChoucairData jobChoucairData;

    public Apply(JobChoucairData jobChoucairData) {
        this.jobChoucairData = jobChoucairData;
    }

    public static Apply toWork(JobChoucairData jobChoucairData) {
        return Tasks.instrumented(Apply.class, jobChoucairData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(APPLY_FOR_JOB),
                Enter.theValue(jobChoucairData.getStrName()).into(FULL_NAME),
                Enter.theValue(jobChoucairData.getStrEmail()).into(INPUT_EMAIL),
                Enter.theValue(jobChoucairData.getPhoneNumber()).into(CELL_PHONE),
                Enter.theValue(jobChoucairData.getStrStudies()).into(STUDIES),
                Enter.theValue(jobChoucairData.getWorkExperience()).into(EXPERIENCE_TIME),
                Enter.theValue(jobChoucairData.getTechnicalKnowledge()).into(PRIOR_KNOWLEDGE),
                Enter.theValue(jobChoucairData.getSalaryAspiration()).into(SALARY_ASPIRATION),
                Enter.theValue(jobChoucairData.getStrAvailability()).into(AVAILABLE_TIME),
                Enter.theValue(jobChoucairData.getAditionalMessage()).into(ADDITIONAL_MESSAGE),
                Click.on(SEND_REQUEST)
        );
    }
}
