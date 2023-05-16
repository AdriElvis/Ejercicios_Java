package com.softtek.modelo;

public class Ave extends Animal implements ObjetoVolador{

    @Override
    public String despegar() {

        return "Ave despegando";
    }

    @Override
    public String aterrizar() {

        return "Ave aterrizando";
    }

    @Override
    public String volar() {

        return "Ave volando";
    }

    public String hacerNido(){
        return "Haciendo nido";
    }

    public String ponerHuevos(){
        return "Poniendo huevos";
    }
}
