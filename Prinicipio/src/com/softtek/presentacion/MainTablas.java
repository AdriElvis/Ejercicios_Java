package com.softtek.presentacion;
import com.softtek.modelo.Tablas;
public class MainTablas {
    public static void main(String[] args) {
        Tablas tabla = new Tablas(5);

        System.out.println(tabla.resultado());
    }
}
