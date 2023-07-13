package com.example.mipueblo.Models;

public class ModelHoteles {

    private String nombre;
    private String precio;
    private int foto;

    public ModelHoteles() {
    }

    public ModelHoteles(String nombre, String precio, int foto) {
        this.nombre = nombre;
        this.precio = precio;
        this.foto = foto;
    }

    /* Gets de la clase */
    public String getNombre() {
        return nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public int getFoto() {
        return foto;
    }

    /* Seters de la clase  */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
