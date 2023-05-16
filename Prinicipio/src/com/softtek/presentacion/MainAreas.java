package com.softtek.presentacion;

import com.softtek.modelo.Areas;

public class MainAreas {
    public static void main(String[] args) {
        Areas area = new Areas ();

        System.out.println(area.areaCirculo(15.2));
        System.out.println(area.areaRectangulo(22.2,12.5));
    }
}
