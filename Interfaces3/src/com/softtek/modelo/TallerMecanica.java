package com.softtek.modelo;

public class TallerMecanica implements ITaller{
    @Override
    public String reparar(Coche c) {
        return "Taller de Mecánica";
    }
}
