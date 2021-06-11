package co.com.certificacion.interactions;

import co.com.certificacion.userinterfaces.RegistroUsuario;
import net.serenitybdd.core.pages.WebElementState;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Map;

import static co.com.certificacion.userinterfaces.RegistroUsuario.*;
import static co.com.certificacion.utils.ConstantesRegistoUsuario.*;

public class RegistrarUsuario implements Interaction {

    private Map<String,String> data;
    public RegistrarUsuario(Map<String,String> data){
        this.data=data;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(PRIMER_NOMBRE)).into(INPUT_PRIMER_NOMBRE),
                Enter.theValue(data.get(APELLIDO)).into(INPUT_APELLIDO),
                Enter.theValue(data.get(EMAIL)).into(INPUT_EMAIL),
                SelectOpcionDeListaDesplegable.opcion(ID_MES_NACIMIENTO, data.get(MES_NACIMIENTO)),
                SelectOpcionDeListaDesplegable.opcion(ID_DIA_NACIMIENTO, data.get(DIA_NACIMIENTO)),
                SelectOpcionDeListaDesplegable.opcion(ID_ANO_NACIMIENTO, data.get(ANO_NACIMIENTO)),
                Click.on(BOTON_SIGUIENTE_FORMULARIO),
                Click.on(BOTON_SIGUIENTE_DISPOSITIVOS)



        );
        WaitUntil.the(SELECT_OS_MI_COMPUTER, WebElementStateMatchers.isEnabled()).forNoMoreThan(5).seconds();
        actor.attemptsTo( Click.on(SELECT_OS_MI_COMPUTER));
        actor.attemptsTo(Enter.theValue(data.get(OS_MI_COMPUTADOR)).into(INPUT_OS_MI_COMPUTER));
        actor.attemptsTo( Click.on(SELECT_VERSION_MI_COMPUTER));
        actor.attemptsTo(Enter.theValue(data.get(VERSION_MI_COMPUTADOR)).into(INPUT_VERSION_MI_COMPUTER));
        actor.attemptsTo( Click.on(SELECT_MOVIL));
        actor.attemptsTo(Enter.theValue(data.get(MOVIL_MARCA)).into(INPUT_MARCA_MOVIL));
        actor.attemptsTo( Click.on(BOTON_ULTIMO_FORMUALARIO));


        actor.attemptsTo(Enter.theValue(data.get(CONTRASENA)).into(INPUT_CONTRASENA),
        Enter.theValue(data.get(CONTRASENA_CONFIRMADA)).into(INPUT_CONFIRMAR_CONTRASENA),
        Click.on(ACEPTAR_TERMINOS),
        Click.on(ACEPTAR_PRIVACIDAD_SEGURIDAD),
        Click.on(BOTON_COMPLETAR_REGISTRO)
        );











    }

    public static RegistrarUsuario conDatos(Map<String,String> data){
        return Tasks.instrumented(RegistrarUsuario.class, data);
    }
}
