package co.com.certificacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOpcionDeListaDesplegable  implements Interaction {

    private String id;
    private String opcion;
    SelectOpcionDeListaDesplegable(String id, String opcion){
        this.id= id;
        this.opcion = opcion;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        Select dropdown = new Select(driver.findElement(By.id(id)));
        dropdown.selectByVisibleText(opcion);
    }

    public static SelectOpcionDeListaDesplegable opcion (String id, String opcion){
        return Tasks.instrumented(SelectOpcionDeListaDesplegable.class, id,opcion);
    }
}
