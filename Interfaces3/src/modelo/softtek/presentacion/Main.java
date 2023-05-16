package modelo.softtek.presentacion;
import com.softtek.modelo.*;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("2023 LLL", "Seat Ibiza");
        TallerMecanica tm = new TallerMecanica();
        TallerPintura tp = new TallerPintura();
        SeguroCoche seguro1 = new SeguroCoche(tp,"aseguradora");

        System.out.println(seguro1.reparar(coche));
        seguro1.setTaller(tm);
        System.out.println(seguro1.reparar(coche));
    }
}