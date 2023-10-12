package org.example;

public class Pizza {

    private Rozmiar rozmiar;
    private String nazwa;
    private double cena;

    Pizza(Rozmiar rozmiar, String nazwa, double cena) {
        this.rozmiar = rozmiar;
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public String getNazwa() {
        return this.nazwa;
    }

    public double getCena() {
        return this.cena;
    }

    public Rozmiar getRozmiar() {
        return rozmiar;
    }
}
