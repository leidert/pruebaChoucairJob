package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchJobPage extends PageObject {
    public static Target BUTTON_COOKIE = Target.the("aceptar cookies").located(By.id("cookie_action_close_header"));
    public static Target BUTTON_SEARCH_JOB = Target.the("oprimir boton buscar trabajo").located(By.xpath("//*[@id='content']/div/div/div/div/div/section[8]/div/div/div/div/div/div[3]/div/div/div/form/div[1]/div[4]/input"));
    public static Target INPUT_JOB =  Target.the("buscar el trabajo").located(By.xpath("//*[@id='search_keywords']"));
    public static Target INPUT_CITY = Target.the("buscar la ciudad").located(By.id("search_location"));
    public static Target SELECT_JOB_OPTION = Target.the("Da click para ver la oferta de trabajo").located(By.xpath("//*[@id='content']/div/div/div/div/div/section[8]/div/div/div/div/div/div[3]/div/div/div/ul/li/a/div[1]/h3"));
    public static Target NAME_COURSE = Target.the("Mensaje a verificar").located(By.xpath("//*[contains(text(),'is a required field')]"));
}
