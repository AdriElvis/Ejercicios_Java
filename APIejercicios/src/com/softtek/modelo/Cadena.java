package com.softtek.modelo;

public class Cadena {
    String cadena = "Bienvenidos al curso de Java";

    public Cadena(){}

    public String mayus(){
        return this.cadena.toUpperCase();
    }

    public String minus(){
        return this.cadena.toLowerCase();
    }

    public String bienvenido(){
        return this.cadena.substring(0, 11);
    }

    public String java(){
        return this.cadena.substring(24);
    }

    public String curso(){
        return this.cadena.substring(15, 21);
    }

    public int c(){
        return this.cadena.indexOf('c');
    }

    public int longitud(){
        return this.cadena.length();
    }

    public String reemplazar(){
        return this.cadena.replace('e', 'E');
    }

    public String concatenar(){
        String nuevaCadena = this.cadena+" con fecha 14 de Septiembre";
        return nuevaCadena;
    }
}
