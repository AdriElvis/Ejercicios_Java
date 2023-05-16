package com.softtek.presentacion;
import com.softtek.modelo.*;
public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        Conductor adri = new Conductor(coche);

        System.out.println(adri.conducir());
        System.out.println(coche.getDeposito());
    }
}