package com.softtek.modelo;

public class ClienteDAO {
    private IDAO conexion;

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
