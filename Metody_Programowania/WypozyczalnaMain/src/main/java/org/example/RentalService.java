package org.example;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class RentalService {
    private final CarStorage carStorage;
    private final RentalStorage rentalStorage;

    public RentalService(CarStorage carStorage, RentalStorage rentalStorage) {
        this.carStorage = carStorage;
        this.rentalStorage = rentalStorage;
    }


    public Optional<Car> findCarByVin(String vin) {
        return carStorage.getAll().stream()
                .filter(car -> car.getVin().equals(vin))
                .findFirst();
    }

    public boolean isAvalible(String vin, LocalDate startDate, LocalDate endDate) {
        boolean carDoesNotExist = findCarByVin(vin).isEmpty();
        if (carDoesNotExist) {
            return false;
        }

        if (rentalStorage.getAllRental().isEmpty()) {
            return true;
        }

        List<Rental> rentalsForVin = rentalStorage.getAllRental().stream()
                .filter(rental -> rental.getCar().getVin().equals(vin))
                .toList();

        for (Rental rental: rentalsForVin) {
            if (isOverlappingDate(startDate, endDate, rental)) {
                return false;
            }
        }

        return true;
    }

    protected boolean isOverlappingDate(LocalDate startDate, LocalDate endDate, Rental rental) {
        boolean isEndDateBeforeRentalStart = endDate.isBefore(rental.getStartDate());
        boolean isStartDateAfterRentalEnd = startDate.isAfter(rental.getEndDate());
        return !(isEndDateBeforeRentalStart || isStartDateAfterRentalEnd);
    }


    public double estimatePrice(String vin, LocalDate startDate, LocalDate endDate) {
        Car carByVin = findCarByVin(vin).orElseThrow();
        long days = Duration.between(startDate.atStartOfDay(), endDate.atStartOfDay()).toDays();

        return days * 500 * carByVin.getKlasa().getMultiplier();
    }

    public Rental rent(int userId, String vin, LocalDate startDate, LocalDate endDate) {
        Car carByVin = findCarByVin(vin).orElseThrow();
        if (isAvalible(vin, startDate, endDate)) {
            Rental rental = new Rental(new User(userId), carByVin, startDate, endDate);
            rentalStorage.addRental(rental);
            return rental;
        } else {
            return null;
        }
    }



}
/*
//rental service
//    rentalService.rent(vin, userID, startdate, endDate) <-- krok 5
//        czy istnieje
//        czy jest dostepny <-- krok 7.
//          wynająć samochód
//          else powiadomic o niedostepnosci.
//        zwrocic status wynajecia
//    czy jest dostepny isAvailable
//    cena - estimatedPrice
//    rentalService.isAvalible(vin, startDate, endDate) <-- krok 6
        //czy samochod istnieje
        //czy istnieje rental dla tego samochodu.
            true
                data poczatkowa mniejsza od daty koncowej rentala
                data koncowa musi byc mniejsza od poczatkowej rentala

            false
                zwracamy informacje że auto dostępne
           rentalService.estimatePrice(vin, startDate, endDate) { <-- krok 2
                wyszukac samochod dla VIN <-- krok 1
                ilosc dni * cena za dzien * wspolczynnik z typu pojazdu}
//    carService.addCar*/
