package com.mycompany.actividad01;

public class Videojuego {

    private String titulo;
    private String genero;
    private double precio;
    private int lanzamientoAnio;

    public Videojuego() {
        this.titulo = "";
        this.genero = "";
        this.precio = 0.0;
        this.lanzamientoAnio = 0;
    }

    public Videojuego(String titulo, String genero, double precio, int lanzamientoAnio) {
        this.titulo = titulo;
        this.genero = genero;
        this.precio = precio;
        this.lanzamientoAnio = lanzamientoAnio;
    }
}
