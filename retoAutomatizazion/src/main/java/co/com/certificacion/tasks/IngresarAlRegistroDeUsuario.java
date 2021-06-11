package co.com.certificacion.tasks;

import co.com.certificacion.userinterfaces.RegistroUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.certificacion.userinterfaces.RegistroUsuario.UNETE_HOY;

public class IngresarAlRegistroDeUsuario implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UNETE_HOY));
    }

    public static IngresarAlRegistroDeUsuario conClick(){
        return Tasks.instrumented(IngresarAlRegistroDeUsuario.class);
    }
}
