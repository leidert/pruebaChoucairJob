package co.com.choucair.certification.proyectobase.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairJobPages {
    public static final Target EMPLOYMENT_SECTION = Target.the("go to the jobs page")
            .located(By.id("menu-item-550"));
}
