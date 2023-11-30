package org.example;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class RentalServiceTest {
    private RentalStorage rentalStorage;
    private CarStorage carStorage;
    private RentalService rentalService;


    @BeforeEach
    void startUp() {
        rentalStorage = RentalStorage.getInstance();
        carStorage = CarStorage.getInstance();
        rentalService = new RentalService(carStorage, rentalStorage);
    }

    @AfterEach
    void cleanup() {
        carStorage.purgeList();
    }
    @Test
    void shouldFindCar() {
        //GIVEN
        Car car = new Car("make", "model", "some-vin", Klasa.PREMIUM);
        carStorage.add(car);
        //WHEN
        Optional<Car> carByVin = rentalService.findCarByVin("some-vin");
        //THEN
        assertThat(carByVin).isPresent();
    }

    @Test
    void shouldNotFindCar() {
        //WHEN
        Optional<Car> carByVin = rentalService.findCarByVin("some-vin");
        //THEN
        assertThat(carByVin).isEmpty();
    }

    @Test
    void shouldBeAvalible() {
        //GIVEN
        Car car = new Car("make", "model", "exists", Klasa.STANDARD);
        carStorage.add(car);
        //WHEN
        boolean carExists = rentalService.isAvalible(car.getVin(), LocalDate.now().plusDays(1), LocalDate.now().plusDays(4));
        //THEN
        assertThat(carExists).isTrue();
    }

    @Test
    void shouldNotBeAvalible() {
        //GIVEN
        //WHEN
        boolean doesntExist = rentalService.isAvalible("vin", LocalDate.now().plusDays(1), LocalDate.now().plusDays(4));
        //ASSERT
        assertThat(doesntExist).isFalse();
    }

    @Test
    void shouldOverlapFromLeft() {
        Rental rental = new Rental(null, null,
                LocalDate.now().plusDays(1),
                LocalDate.now().plusDays(2)
        );

        boolean overlappingDate = rentalService.isOverlappingDate(
                LocalDate.now(),
                LocalDate.now().plusDays(3),
                rental);

        assertThat(overlappingDate).isTrue();
    }
}