package com.softtek.modelo;

public class Cactus extends Planta {
    private boolean tieneEspinas;

    public Cactus(String nombre, int edad, boolean tieneEspinas) {
        super(nombre, edad);
        this.tieneEspinas = tieneEspinas;
    }

    public boolean isTieneEspinas() {
        return tieneEspinas;
    }

    public void setTieneEspinas(boolean tieneEspinas) {
        this.tieneEspinas = tieneEspinas;
    }

    @Override
    public void regar(int cantidad, int tiempo) {
        System.out.println("Regando el cactus " + getNombre() + " con " + cantidad + " ml de agua durante " + tiempo + " minutos.");
    }
}
