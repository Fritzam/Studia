package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List pizze = new ArrayList();
        pizze.add(new Pizza(Rozmiar.srednia, "HotCheese", 40.50));
        pizze.add(new Pizza(Rozmiar.mala, "Capriciosa", 27.50));

        Zamowienie zamowienieUzytkownika = new Zamowienie(pizze, 802040);

        System.out.println("Przyjelismy Panstwa zamowienie.\nNumer zamowienia to: " + zamowienieUzytkownika.getNumerZamowienia() + ".");
        System.out.println("W Panstwa zamowieniu zawieraja sie pizze: ");
        for (int i = 0; i < zamowienieUzytkownika.pizze.size(); i++) {
            System.out.println(zamowienieUzytkownika.pizze.get(i).getNazwa());
        }
        System.out.println("Ktore razem kosztuja: " + zamowienieUzytkownika.getKoszt() + "zl.");
    }
}