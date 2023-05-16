package com.softtek.presentacion;
import java.util.Scanner;

import com.softtek.modelo.Dado;

public class MainDado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dado dado = new Dado();


        String acepta;
        do{
            dado.lanzar();
            System.out.println(dado.mostrar());
            System.out.println("Quiere continuar S/N");
            acepta = sc.next();
        }
        while(acepta.equalsIgnoreCase("s"));
    }
}
