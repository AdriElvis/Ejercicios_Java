package com.softtek.modelo;
public class Alumno {

    public double [] notas;
    public String nombreCompleto;

    public Alumno(String nombreCompleto, int totalParciales){
        this.nombreCompleto = nombreCompleto;
        this.notas = new double[totalParciales];
    }

    public void setNotas(double... notas){

        if(notas.length == this.notas.length){
            for (int i = 0; i < this.notas.length; i++) {
                this.notas[i] = notas [i];
            }
        }
        else{
            System.out.println("La cantidad de notas no corresponden con la cantidad de parciales");
        }
    }

    public double promedio(){
        double suma = 0;

        for (int i = 0; i < this.notas.length; i++) {
            suma = suma+this.notas[i];
        }

        return suma/this.notas.length;
    }
    public void getNotas() {
        for (int i = 0; i < this.notas.length; i++) {
            System.out.println(this.notas[i]);
        }
    }
}
