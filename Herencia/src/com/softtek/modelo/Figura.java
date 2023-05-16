package com.softtek.modelo;
public class Figura {

    private int coordenadaX;
    private int coordenadaY;

    public Figura(int coordenadaX, int coordenadaY){
        this.coordenadaX=coordenadaX;
        this.coordenadaY=coordenadaY;
    }

    public String posicion(){
        return "("+this.coordenadaX+","+this.coordenadaY+")";
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }
}
