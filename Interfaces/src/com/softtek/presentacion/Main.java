package com.softtek.presentacion;
import com.softtek.modelo.*;

public class Main {
    public static void main(String[] args) {
        ObjetoVolador avion = new Avion();
        ObjetoVolador ave = new Ave();
        ObjetoVolador superman = new Superman();
        ObjetoVolador hidro = new Hidroavion();
        Nautico hidroavion = new Hidroavion();
        Nautico barcaza = new Barcaza();

        ObjetoVolador [] voladores = new ObjetoVolador[]{avion,ave,superman,hidro};
        Nautico [] nauticos = new Nautico[]{barcaza,hidroavion};

        for (ObjetoVolador volador: voladores){
            System.out.println(volador.despegar());
            System.out.println(volador.volar());
            System.out.println(volador.aterrizar());

            if(volador instanceof Ave){
                System.out.println(((Ave) volador).ponerHuevos());
                System.out.println(((Ave) volador).hacerNido());
            }

            if(volador instanceof Superman){
                System.out.println(((Superman) volador).saltarEdificio());
                System.out.println(((Superman) volador).detenerBala());
            }

            if(volador instanceof Avion){
                System.out.println(((Avion) volador).despegar());
                System.out.println(((Avion) volador).volar());

            }
        }
        for (Nautico nautico: nauticos){
            System.out.println(nautico.navegar());
            System.out.println(nautico.atracar());

            if(nautico instanceof Hidroavion){
                System.out.println((((Hidroavion) nautico).despegar()));
                System.out.println(((Hidroavion) nautico).volar());
            }
        }

    }
}