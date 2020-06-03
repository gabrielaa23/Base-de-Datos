package com.bibliosearch.libros;

public class Libros {

    static String nombre, contenido, categoria;


    public Libros( String nombre , String contenido, String categoria ) {
        this.nombre = nombre;
        this.contenido = contenido;
        this.categoria = categoria;
    }

    public static String getNombre() {
        return nombre;
    }

    public static String getContenido() {
        return contenido;
    }

    public  static String getCategoria() {
        return categoria;
    }

    public  void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public  void setContenido(String contenido){
        this.contenido = contenido;
    }

    public void setCategoria(String contenido){
        this.categoria = categoria;
    }

    public String toString(){
        return (nombre + " " + categoria + " " + contenido);
    }

}
