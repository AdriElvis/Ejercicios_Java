package com.softtek.modelo;

public class Barco extends Vehiculo{
    private int alturaMastil;

    public Barco(String color, int alturaMastil){
        super(color);
        this.alturaMastil = alturaMastil;
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

    public int getAlturaMastil() {
        return alturaMastil;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "alturaMastil=" + alturaMastil +
                '}';
    }
}
