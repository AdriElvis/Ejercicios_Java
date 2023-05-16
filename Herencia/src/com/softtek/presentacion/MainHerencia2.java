package com.softtek.presentacion;
import com.softtek.modelo.Coche;
import com.softtek.modelo.Tren;
import com.softtek.modelo.Avion;
import com.softtek.modelo.Barco;
public class MainHerencia2 {
    public static void main(String[] args) {
        Coche coche = new Coche("azul",4);
        Tren tren = new Tren("azul",5);
        Avion avion = new Avion("azul",3);
        Barco barco = new Barco("azul",15);
    }
}
