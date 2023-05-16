package com.softtek.presentacion;
import com.softtek.modelo.Circulo;
import com.softtek.modelo.Rectangulo;
public class MainHerencia1 {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(15,30,12.5);
        Rectangulo rectangulo = new Rectangulo(88,5,10.2,25.5);

        System.out.println(circulo.posicion());
        System.out.println(rectangulo.posicion());
    }
}