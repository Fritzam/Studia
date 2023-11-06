package org.example;

import java.util.ArrayList;
import java.util.List;

public class ParkMaszynowy {
    List<Samochod> dostepnePojazdy = new ArrayList<>();
    private static ParkMaszynowy parkMaszynowy = null;

    private void parkMaszynowy() {

    }
    public void dodajSamochod(Samochod samochod) {
        dostepnePojazdy.add(samochod);
    }

    public static ParkMaszynowy getInstance() {
        if (parkMaszynowy == null) {
            parkMaszynowy = new ParkMaszynowy();
        }
        return parkMaszynowy;
    }
    public List<Samochod> wyswietlDostepneSamochody() {
        return dostepnePojazdy;
    }

}
