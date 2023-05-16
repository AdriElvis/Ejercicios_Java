package com.softtek.modelo;

public class Campos {
    public int x;

    public Campos(int x){
        this.x=x;
    }

    public void incrementar(){
        this.x++;
    }

    public int mostrar(){
        return this.x;
    }
}
