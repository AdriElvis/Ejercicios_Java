package com.softtek.modelo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClienteDAO {
    @Autowired
    private IDAO conexion;

    public ClienteDAO(){}
    public ClienteDAO(IDAO conexion){
        this.conexion=conexion;
    }
    public String insertar(Cliente c1){
        return this.conexion.insertar(c1);
    }

    public void setConexion(IDAO conexion) {
        this.conexion = conexion;
    }
}
