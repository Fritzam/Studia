package org.example;

import java.time.LocalDate;

public class Wynajem {
    public Uzytkownik getUzytkownik() {
        return uzytkownik;
    }

    public Samochod getSamochod() {
        return samochod;
    }

    public LocalDate getDataPoczatkowa() {
        return dataPoczatkowa;
    }

    public LocalDate getDataKoncowa() {
        return dataKoncowa;
    }

    private Uzytkownik uzytkownik;
    private Samochod samochod;
    private LocalDate dataPoczatkowa;
    private LocalDate dataKoncowa;

    public Wynajem(Uzytkownik uzytkownik, Samochod samochod, LocalDate dataPoczatkowa, LocalDate dataKoncowa) {
        this.uzytkownik = uzytkownik;
        this.samochod = samochod;
        this.dataPoczatkowa = dataPoczatkowa;
        this.dataKoncowa = dataKoncowa;
    }
}
