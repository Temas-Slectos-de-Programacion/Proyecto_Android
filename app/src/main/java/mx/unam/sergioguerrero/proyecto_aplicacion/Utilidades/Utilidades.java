package mx.unam.sergioguerrero.proyecto_aplicacion.Utilidades;

/**
 * Created by sergioguerrero on 29/05/18.
 */

public class Utilidades {

    public static final String TABLA_USUARIO = "usuario";
    public static final String CAMPO_ID = "id";
    public static final String CAMPO_NOMBRE = "nombre";
    public static final String CAMPO_PREGUNTA = "pregunta";

    public static final String CREAR_TABLA_USUARIO ="CREATE_TABLE" + TABLA_USUARIO + "("+CAMPO_ID+" INTEGER, "+CAMPO_NOMBRE+" TEXT, "+CAMPO_PREGUNTA+" TEXT )";
}
