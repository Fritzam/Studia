package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Magazyn {
    List<Wynajem> aktualneWynajecia = new ArrayList<>();

    private static Magazyn magazyn = null;
    private Magazyn() {

    }

    public static Magazyn getInstance() {
        if (magazyn == null) {
            magazyn = new Magazyn();
        }
        return magazyn;
    }

    public void dodajWynajecie(Wynajem wynajem) {
        aktualneWynajecia.add(wynajem);
    }

    public boolean sprawdzDostepnosc(String vin, LocalDate dataPoczatkowa, LocalDate dataKoncowa) {
        for (int i = 0; i < aktualneWynajecia.size(); i++) {
            if (vin.equals(aktualneWynajecia.get(i).getSamochod().getVinPojazdu())) {
                //if (aktualneWynajecia.get(i).getDataPoczatkowa())
            }
        }
        return false;
    }
}
