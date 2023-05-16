package com.softtek.modelo;
/*EJERCICIO 3
Crear la clase Areas con métodos para calcular el área de un circulo y el área de un
rectángulo. Desde una clase principal realizar ambos cálculos y mostrarlos por pantalla.*/
public class Areas {
    public Areas(){}
    public double areaCirculo(double radio){
        return Math.PI * radio * radio;
    }
    public double areaRectangulo(double base, double altura){
        return base * altura;
    }
}
