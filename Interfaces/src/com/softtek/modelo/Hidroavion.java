package com.softtek.modelo;

public class Hidroavion extends Avion implements Nautico,ObjetoVolador{
    @Override
    public String atracar() {
        return "Hidroavion atracado";
    }

    @Override
    public String navegar() {
        return "Hidroavion navegando";
    }

    @Override
    public String despegar() {
        return "Hidoravion despegando";
    }

    @Override
    public String volar() {
        return "Hidroavion volando";
    }

    @Override
    public String aterrizar() {
        return "Hidroavion aterrizando";
    }
}
