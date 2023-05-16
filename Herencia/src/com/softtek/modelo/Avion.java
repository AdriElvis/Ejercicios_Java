package com.softtek.modelo;

public class Avion extends Vehiculo{
    private int motores;

    public Avion(String color, int motores){
        super(color);
        this.motores = motores;
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

    public int getMotores() {
        return motores;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "motores=" + motores +
                '}';
    }
}
