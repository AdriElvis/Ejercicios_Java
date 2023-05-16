package com.softtek.modelo;

public class SeguroCoche {
    private ITaller taller;
    private String aseguradora;

    public SeguroCoche(ITaller taller, String aseguradora){
        this.taller = taller;
        this.aseguradora = aseguradora;
    }
    public String reparar(Coche c){
        return this.taller.reparar(c);
    }

    public void setTaller(ITaller taller) {
        this.taller = taller;
    }
}
