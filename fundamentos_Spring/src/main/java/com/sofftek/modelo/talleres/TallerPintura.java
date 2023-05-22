package com.sofftek.modelo.talleres;

public class TallerPintura implements ITaller{
    @Override
    public String reparar(CocheT c) {
        return "Taller de Pintura";
    }
}
