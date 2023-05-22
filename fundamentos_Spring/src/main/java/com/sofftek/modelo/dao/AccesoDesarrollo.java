package com.sofftek.modelo.dao;

import org.springframework.stereotype.Component;

public class AccesoDesarrollo implements IDAO{
    @Override
    public String insertar(Cliente c1) {
        return "Acceso desarrollo";
    }
}
