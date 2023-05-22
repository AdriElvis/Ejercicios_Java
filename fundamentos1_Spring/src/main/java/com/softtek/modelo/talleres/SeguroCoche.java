package com.softtek.modelo.talleres;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SeguroCoche {
    @Autowired
    private ITaller taller;
    private String aseguradora ="Ocasos";

    public SeguroCoche(ITaller taller){
        this.taller = taller;
        this.aseguradora = aseguradora;
    }
    public String reparar(CocheT c){
        return this.taller.reparar(c);
    }

    public void setTaller(ITaller taller) {
        this.taller = taller;
    }
}
