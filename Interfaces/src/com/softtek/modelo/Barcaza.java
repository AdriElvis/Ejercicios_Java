package com.softtek.modelo;

public class Barcaza extends Vehiculo implements Nautico{
    @Override
    public String atracar() {
        return "Barcacza atracada";
    }

    @Override
    public String navegar() {
        return "Barcaza navegando";
    }
}
