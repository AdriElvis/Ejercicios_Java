package com.softtek.modelo;

public class TallerPintura implements ITaller{
    @Override
    public String reparar(Coche c) {
        return "Taller de Pintura";
    }
}
