package com.softtek.modelo;

public class Coche extends Vehiculo{
    private int puertas;

    public Coche(String color, int puertas){
        super(color);
        this.puertas = puertas;
    }

    @Override
    public void acelerar() {
        super.acelerar();
    }

    @Override
    public void frenar() {
        super.frenar();
    }

    @Override
    public int getVelocidad() {
        return super.getVelocidad();
    }

    public int getPuertas() {
        return puertas;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "puertas=" + puertas +
                '}';
    }
}
