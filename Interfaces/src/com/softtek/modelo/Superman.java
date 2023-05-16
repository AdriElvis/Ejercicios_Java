package com.softtek.modelo;

public class Superman extends Kriptoniano implements ObjetoVolador{
    @Override
    public String despegar() {

        return "Superman despegando";
    }

    @Override
    public String aterrizar() {

        return "Superman aterrizando";
    }

    @Override
    public String volar() {

        return "Superman volando";
    }

    public String saltarEdificio(){
        return "Edificio saltado";
    }

    public String detenerBala(){
        return "Bala detenida";
    }
}
