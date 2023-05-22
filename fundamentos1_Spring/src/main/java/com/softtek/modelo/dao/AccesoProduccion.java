package com.softtek.modelo.dao;

import org.springframework.stereotype.Component;

@Component
public class AccesoProduccion implements IDAO {
    @Override
    public String insertar(Cliente c1) {
        return "Acceso producción";
    }
}
