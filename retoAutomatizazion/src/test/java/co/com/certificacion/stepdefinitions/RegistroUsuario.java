package co.com.certificacion.stepdefinitions;

import co.com.certificacion.interactions.RegistrarUsuario;
import co.com.certificacion.tasks.IngresarAlRegistroDeUsuario;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistroUsuario {
    @Dado("^que el usuario se encuentra dentro del registro de nuevo usuario$")
    public void queElUsuarioSeEncuentraDentroDelRegistroDeNuevoUsuario() {
        theActorInTheSpotlight().attemptsTo(IngresarAlRegistroDeUsuario.conClick());
    }


    @Cuando("^el ingresa la informacion solicitada para registarse$")
    public void elIngresaLaInformacionSolicitadaParaRegistarse(Map<String,String> data) {
        theActorInTheSpotlight().attemptsTo(RegistrarUsuario.conDatos(data));
    }

    @Entonces("^visualizara un mensaje de bienvenida por haberse registrado$")
    public void visualizaraUnMensajeDeBienvenidaPorHaberseRegistrado() {

    }
}
