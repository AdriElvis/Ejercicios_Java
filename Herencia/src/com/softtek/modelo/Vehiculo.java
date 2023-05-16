package com.softtek.modelo;
public class Vehiculo {
    private int velocidad=0;
    private String color;

    public Vehiculo(String color){
        this.color = color;
    }

    public void acelerar(){
        this.velocidad++;
    }
    public void frenar(){
        if(this.velocidad >0){
            this.velocidad--;
        }
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
