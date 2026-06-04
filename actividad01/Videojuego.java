package com.mycompany.actividad01;

public class Videojuego {

    /**
     * Los atributos titulo,genero,precio y lanzamientoAnio
     */
    private String titulo;
    private String genero;
    private double precio;
    private int lanzamientoAnio;

    /**
     * Contructor sin parametos
     */
    public Videojuego() {
        this.titulo = "";
        this.genero = "";
        this.precio = 0.0;
        this.lanzamientoAnio = 0;
    }

    /**
     * Constructor con parametros
     *
     * @param titulo
     * @param genero
     * @param precio
     * @param lanzamientoAnio
     */
    public Videojuego(String titulo, String genero, double precio, int lanzamientoAnio) {
        this.titulo = titulo;
        this.genero = genero;
        this.precio = precio;
        this.lanzamientoAnio = lanzamientoAnio;
    }

    /**
     * Metodos Getters y Setters
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setLanzamientoAnio(int lanzamientoAnio) {
        this.lanzamientoAnio = lanzamientoAnio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public double getPrecio() {
        return precio;
    }

    public int getLanzamientoAnio() {
        return lanzamientoAnio;
    }

}
