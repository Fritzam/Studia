package org.example;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class Main {
    private final CarStorage carStorage;
    private final RentalService rentalService;

    public Main(CarStorage carStorage, RentalService rentalService) {
        this.carStorage = carStorage;
        this.rentalService = rentalService;

        execProcess();
    }
    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);
    }

    public void execProcess() {
        Car vwGolf2 = new Car("Volkswagen", "Golf 2", "123A", Klasa.PREMIUM);
//        Car fiatPanda = new Car("Fiat", "Panda", "55CL", Klasa.SPORT);

       /* CarStorage carstorage = CarStorage.getInstance();
        carstorage.add(vwGolf2);
        carstorage.add(peugeot207);
        carstorage.add(fiatPanda);
        */

        carStorage.add(vwGolf2);

        double abc = rentalService.estimatePrice("123A", LocalDate.now().plusDays(1),
                LocalDate.now().plusDays(3));

        System.out.println(abc);
    }

}