package com.softtek.modelo;

public class PlantaTropical extends Planta {
    private boolean necesitaSol;

    public PlantaTropical(String nombre, int edad, boolean necesitaSol) {
        super(nombre, edad);
        this.necesitaSol = necesitaSol;
    }

    public boolean isNecesitaSol() {
        return necesitaSol;
    }

    public void setNecesitaSol(boolean necesitaSol) {
        this.necesitaSol = necesitaSol;
    }

    @Override
    public void regar(int cantidad, int tiempo) {
        System.out.println("Regando la planta tropical " + getNombre() + " con " + cantidad + " ml de agua durante " + tiempo + " minutos.");
    }
}
