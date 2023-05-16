package com.softtek.modelo;

public abstract class Planta {
    private String nombre;
    private int edad;

    public Planta(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract void regar(int cantidad, int tiempo);
    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {

        this.edad = edad;
    }
}



