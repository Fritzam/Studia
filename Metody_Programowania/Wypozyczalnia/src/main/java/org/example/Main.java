package org.example;

public class Main {
    public static void main(String[] args) {

        //rentalService.rent(vin, userid);
            //czy samochod istnieje
            //czy jest dostepny
            //zwrocic status wynajecia.
        //rentalService.isAvalible(vin, sartdate, endDate);
        //rentalService.estimatePrice(vin, startDate, endDate);

        ParkMaszynowy parkMaszynowy = ParkMaszynowy.getInstance();
        Samochod samochod = new Samochod("Volkswagen", "Passat", "vivin", Klasa.standard);
        parkMaszynowy.dodajSamochod(samochod);
        System.out.println(parkMaszynowy.wyswietlDostepneSamochody());
        System.out.println("---------------------------");

        ParkMaszynowy parkMaszynowy2 = ParkMaszynowy.getInstance();
        Samochod samochod2 = new Samochod("Volkswagen", "Golf", "A12D155", Klasa.economical);
        parkMaszynowy2.dodajSamochod(samochod2);
        System.out.println(parkMaszynowy2.wyswietlDostepneSamochody());

    }
}