package org.example;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Car vwGolf2 = new Car("Volkswagen", "Golf 2", "123A", Klasa.PREMIUM);
//        Car fiatPanda = new Car("Fiat", "Panda", "55CL", Klasa.SPORT);

       /* CarStorage carstorage = CarStorage.getInstance();
        carstorage.add(vwGolf2);
        carstorage.add(peugeot207);
        carstorage.add(fiatPanda);
        */

        CarStorage carStorage = CarStorage.getInstance();
        carStorage.add(vwGolf2);
        RentalStorage rentalStorage = RentalStorage.getInstance();
        RentalService rentalService = new RentalService(carStorage, rentalStorage);

        double abc = rentalService.estimatePrice("123A", LocalDate.now().plusDays(1),
                LocalDate.now().plusDays(3));

        System.out.println(abc);




    }
}