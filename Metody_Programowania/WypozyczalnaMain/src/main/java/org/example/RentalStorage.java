package org.example;
import java.util.*;

public class RentalStorage {
    private RentalStorage(){};
    private List<Rental> rentalList = new ArrayList<>();
    private static RentalStorage rentalStorage = null;
    public static RentalStorage getInstance() {
        if (rentalStorage == null) rentalStorage = new RentalStorage();
        return rentalStorage;
    }

    public void addRental(Rental rental){
        rentalList.add(rental);
    }
    public List<Rental> getAllRental(){
        return rentalList;
    }

}
//rental service
//    wynajecie samochodu rent
//        czy istnieje
//        czy jest dostepny
//        zwrocic status wynajecia
//    czy jest dostepny isAvailable
//    cena - estimatedPrice

//    carService.addCar