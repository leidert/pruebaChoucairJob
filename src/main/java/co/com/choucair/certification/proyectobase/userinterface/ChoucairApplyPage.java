package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairApplyPage {
    public static Target APPLY_FOR_JOB = Target.the("click para enviar hoja de vida").located(By.xpath("//input[@class='application_button button']"));
    public static Target FULL_NAME = Target.the("correo electronico").located(By.id("nombre-completo"));
    public static Target INPUT_EMAIL = Target.the("correo electronico").located(By.id("correo-electronico"));
    public static Target CELL_PHONE = Target.the("numero de telefono").located(By.id("celular-o-telefono-de-contacto"));
    public static Target STUDIES = Target.the("estudios realizados").located(By.id("que-estudios-formales-tienes-o-en-que-semestre-te-encuentras-actualmente"));
    public static Target EXPERIENCE_TIME = Target.the("experiencia en automatizacion").located(By.id("que-tiempo-de-experiencia-certificada-tienes-en-pruebas-o-en-desarrollo-de-softwaresi-aplica"));
    public static Target PRIOR_KNOWLEDGE = Target.the("conocimientos previos").located(By.id("conoces-de-automatizacion-de-pruebas-te-gustaria-aprendersi-aplica"));
    public static Target SALARY_ASPIRATION = Target.the("aspiracion salarial").located(By.id("cual-es-tu-aspiracion-salarial"));
    public static Target AVAILABLE_TIME = Target.the("tiempo disponible").located(By.id("si-eres-seleccionado-que-disponibilidad-de-tiempo-para-ingresar-tendrias"));
    public static Target ADDITIONAL_MESSAGE = Target.the("mensaje adicional").located(By.id("mensaje-adicional"));
    public static Target SEND_REQUEST = Target.the("boton enviar").located(By.xpath("//*[@class='button wp_job_manager_send_application_button']"));


}
