package com.softtek.presentacion;

import com.softtek.modelo.AccesoDesarrollo;
import com.softtek.modelo.AccesoProduccion;
import com.softtek.modelo.Cliente;
import com.softtek.modelo.ClienteDAO;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        AccesoProduccion ap = new AccesoProduccion();
        AccesoDesarrollo ad = new AccesoDesarrollo();

        Cliente cliente = new Cliente("Adrián","1111111");
        ClienteDAO cdao = new ClienteDAO(ap);
        System.out.println(cdao.insertar(cliente));
        cdao.setConexion(ad);
        System.out.println(cdao.insertar(cliente));
    }
}