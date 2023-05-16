package com.softtek.modelo;
public class Dado {
    public int numero;
    public Dado(){}

    public void lanzar(){
        this.numero = (int)(Math.random()*(6-1)+1);
    }

    public String mostrar(){
        switch (this.numero){
            case 1:
                return "\n *";
            case 2:
                return "*\n\n  *";
            case 3:
                return "*\n *\n  *";
            case 4:
                return "*  *\n\n*  *";
            case 5:
                return "*  *\n * \n*  *";
            case 6:
                return "*  *\n*  *\n*  *";
            default:
                return "";
        }
    }
}
