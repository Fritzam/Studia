package org.example;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.NoSuchElementException;
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

    @Test
    void shouldOverlapFromRight() {
        //Given
        Rental rental = new Rental(null, null, LocalDate.now(), LocalDate.now().plusDays(4));
        //When
        boolean overlappingDateFromRight = rentalService.isOverlappingDate(LocalDate.now().plusDays(3), LocalDate.now().plusDays(7), rental);
        //Then
        assertThat(overlappingDateFromRight).isTrue();
    }

    @Test
    void shouldCost5000InPremium() {
        //Given
        Car car = new Car("make", "model", "some-vin", Klasa.PREMIUM);
        carStorage.add(car);
        //When
        double price = rentalService.estimatePrice(car.getVin(), LocalDate.now(), LocalDate.now().plusDays(10));
        //Then
        assertThat(price).isEqualTo(5000);
    }

    @Test
    void shouldCost750InStandard() {
        //Given
        Car car = new Car("make", "model", "some-vin", Klasa.STANDARD);
        carStorage.add(car);
        //When
        double price = rentalService.estimatePrice("some-vin", LocalDate.now(), LocalDate.now().plusDays(1));
        //Assert
        assertThat(price).isEqualTo(750);
    }

    @Test
    void shouldCost3000InSport() {
        //Given
        Car car = new Car("make", "model", "some-vin", Klasa.SPORT);
        carStorage.add(car);
        //When
        double price = rentalService.estimatePrice("some-vin", LocalDate.now(), LocalDate.now().plusDays(2));
        //Then
        assertThat(price).isEqualTo(3000);
    }

    @Test
    void shouldReturnRental() {
        //Given
        Car car = new Car("make", "model", "some-vin", Klasa.PREMIUM);
        carStorage.add(car);
        //When
        Rental rental = rentalService.rent(1, "some-vin", LocalDate.now(), LocalDate.now().plusDays(2));
        //Then
        assertThat(rental).isInstanceOf(Rental.class);
    }

    @Test
    void shouldReturnNull() {
        //Given
        Car car = new Car("marka", "model", "some-vin", Klasa.PREMIUM);
        carStorage.add(car);
        //When
        rentalService.rent(1, "some-vin", LocalDate.now().plusDays(1), LocalDate.now().plusDays(5));
        Rental testRental = rentalService.rent(1, "some-vin", LocalDate.now().plusDays(1), LocalDate.now().plusDays(3));
        //Then
        assertThat(testRental).isNull();
    }

}