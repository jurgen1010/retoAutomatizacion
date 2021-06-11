package co.com.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegistroUsuario {

    public static final Target UNETE_HOY = Target.the("boton unete hoy").locatedBy("//a[@class='unauthenticated-nav-bar__sign-up']");
    public static final Target INPUT_PRIMER_NOMBRE = Target.the("input primer nombre").locatedBy("//input[@id='firstName']");
    public static final Target INPUT_APELLIDO = Target.the("input apellido").locatedBy("//input[@id='lastName']");
    public static final Target INPUT_EMAIL = Target.the("input email").locatedBy("//input[@id='email']");
    public static final Target BOTON_SIGUIENTE_FORMULARIO = Target.the("siguiente formulario").locatedBy("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/a[1]");
    public static final Target BOTON_SIGUIENTE_DISPOSITIVOS = Target.the("siguiente formulario dispositivos").locatedBy("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/a[1]");
    public static final Target BOTON_ULTIMO_FORMUALARIO = Target.the("boton ultimo formulario ").locatedBy("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/a[1]");
    public static final Target SELECT_OS_MI_COMPUTER = Target.the("select os mi computer").locatedBy("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/i[1]");
    public static final Target SELECT_VERSION_MI_COMPUTER = Target.the("select version mi computer").locatedBy("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/span[1]/i[1]");
    public static final Target SELECT_MOVIL = Target.the("select movil marca").locatedBy("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/span[1]/i[1]");
    public static final Target INPUT_OS_MI_COMPUTER = Target.the("input os mi computer").locatedBy("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/input[1]");
    public static final Target INPUT_VERSION_MI_COMPUTER = Target.the("input version mi computer").locatedBy("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/input[1]");
    public static final Target INPUT_MARCA_MOVIL = Target.the("input movil marca").locatedBy("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/input[1]");
    public static final Target INPUT_CONTRASENA = Target.the("contrasena").locatedBy("//input[@id='password']");
    public static final Target INPUT_CONFIRMAR_CONTRASENA = Target.the("contrasena confirmar").locatedBy("//input[@id='confirmPassword']");
    public static final Target ACEPTAR_TERMINOS = Target.the("aceptar terminos check").locatedBy("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[5]/label[1]/span[1]");
    public static final Target ACEPTAR_PRIVACIDAD_SEGURIDAD = Target.the("aceptar privacidad seguridad").locatedBy("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[6]/label[1]/span[1]");
    public static final Target BOTON_COMPLETAR_REGISTRO = Target.the("boton completar registro").locatedBy("//a[@id='laddaBtn']");



}
