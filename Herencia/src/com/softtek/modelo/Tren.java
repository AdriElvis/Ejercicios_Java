package com.softtek.modelo;

public class Tren extends Vehiculo {
    private int vagones;

    public Tren(String color, int vagones){
        super(color);
        this.vagones = vagones;
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

    public int getVagones() {
        return vagones;
    }

    @Override
    public String toString() {
        return "Tren{" +
                "vagones=" + vagones +
                '}';
    }
}
