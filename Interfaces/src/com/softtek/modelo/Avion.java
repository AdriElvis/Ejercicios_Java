package com.softtek.modelo;

public class Avion extends Vehiculo implements ObjetoVolador {


    @Override
    public String despegar() {

        return "Avión despegando";
    }

    @Override
    public String aterrizar() {

        return "Avión aterrizando";
    }

    @Override
    public String volar() {

        return "Avión volando";
    }
}
