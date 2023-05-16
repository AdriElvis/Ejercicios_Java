package com.softtek.presentacion;
import com.softtek.modelo.Alumno;
public class MainAlumno {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Adrián Elvis",5);

        alumno1.setNotas(7.75,9.25,7.2,6.95,8.5);
        alumno1.getNotas();
        System.out.println("Promedio: "+alumno1.promedio());
    }
}
