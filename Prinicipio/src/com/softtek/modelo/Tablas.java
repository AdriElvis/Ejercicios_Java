package com.softtek.modelo;

public class Tablas {

    public int num;

    public Tablas(int numero){
        this.num = numero;
    }

    public String resultado(){
        String cadena = "";

        for (int i = 0; i < 11; i++) {
            cadena += this.num+" x "+i+" = "+this.num*i+"\n";
        }

        return cadena;
    }
}
