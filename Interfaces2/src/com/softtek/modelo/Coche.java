package com.softtek.modelo;

public class Coche implements IVehiculo{
    private int deposito;

    public Coche(){
        this.deposito=100;
    }
    @Override
    public String moverse() {
        if(this.deposito==0){
            return "Depósito vacío";
        }
        else{
            this.deposito--;
            return "El coche se ha movido";
        }

    }

    public int getDeposito() {
        return deposito;
    }
}
