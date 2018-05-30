package mx.unam.sergioguerrero.proyecto_aplicacion.BaseDeDatos;

import java.io.Serializable;

/**
 * Created by sergioguerrero on 29/05/18.
 */

public class Usuario implements Serializable{

    private Integer id;
    private String nombre;
    private String pregunta;

    public Usuario(Integer id, String nombre, String pregunta) {
        this.id = id;
        this.nombre = nombre;
        this.pregunta = pregunta;
    }

    public Usuario(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
}
