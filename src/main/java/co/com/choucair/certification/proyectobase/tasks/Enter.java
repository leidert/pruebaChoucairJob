package co.com.choucair.certification.proyectobase.tasks;

import static co.com.choucair.certification.proyectobase.userinterface.ChoucairJobPages.EMPLOYMENT_SECTION;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Enter implements Task {

    public static Enter onTheSection(){
        return Tasks.instrumented(Enter.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(EMPLOYMENT_SECTION));

    }
}
