package com.softtek.presentacion;

import com.softtek.modelo.Campos;
public class Main {
    public static void main(String[] args) {
        Campos prueba1 = new Campos(2);
        System.out.println(prueba1.mostrar());
        prueba1.incrementar();
        System.out.println(prueba1.mostrar());
    }
}