package com.softtek.modelo;
public class Rectangulo extends Figura{
    private double alto;
    private double ancho;

    public Rectangulo(int x, int y, double alto, double ancho){
        super(x,y);
        this.alto = alto;
        this.ancho = ancho;
    }
    @Override
    public String posicion() {
        return super.posicion();
    }
}
