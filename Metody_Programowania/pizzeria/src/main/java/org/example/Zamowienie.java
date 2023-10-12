package org.example;

import java.util.List;

public class Zamowienie {

    List<Pizza> pizze;
    int numerZamowienia;

    public Zamowienie (List<Pizza> pizze, int numerZamowienia) {
        this.pizze = pizze;
        this.numerZamowienia = numerZamowienia;
    }

    public double getKoszt() {
        double kosztCalkowity = 0;

        for (int i = 0; i < pizze.size(); i++) {
            kosztCalkowity += pizze.get(i).getCena();
        }

        return kosztCalkowity;
    }

    public int getNumerZamowienia() {
        return this.numerZamowienia;
    }

}
