package com.softtek.presentacion;
import com.softtek.modelo.Cadena;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/*Crear la cadena de texto: “Bienvenidos al curso de Java”
        Mostrar la cadena toda en mayúsculas
        Mostrar la cadena en minúsculas
        Mostrar solo la palabra Bienvenidos
        Mostrar solo la palabra Java
        Mostrar la palabra curso
        Mostrar la posición de la letra c
        Devolver la longitud de la cadena
        Modificar las e minúsculas por E mayúsculas
        Concatenar la frase anterior con “con fecha 14 de Septiembre”*/
public class Main {
    public static void main(String[] args) {
        Cadena cadena = new Cadena();

        System.out.println(cadena.mayus());
        System.out.println(cadena.minus());
        System.out.println(cadena.bienvenido());
        System.out.println(cadena.java());
        System.out.println(cadena.curso());
        System.out.println(cadena.c());
        System.out.println(cadena.longitud());
        System.out.println(cadena.reemplazar());
        System.out.println(cadena.concatenar());
    }
}