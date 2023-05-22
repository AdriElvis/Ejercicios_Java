package com.softtek.modelo.talleres;

import org.springframework.stereotype.Component;

@Component
public class TallerMecanica implements ITaller{
    @Override
    public String reparar(CocheT c) {
        return "Taller de Mecánica";
    }
}
