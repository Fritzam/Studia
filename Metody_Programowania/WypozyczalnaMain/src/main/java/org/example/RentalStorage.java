package org.example;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class RentalStorage {
    private List<Rental> rentalList = new ArrayList<>();

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