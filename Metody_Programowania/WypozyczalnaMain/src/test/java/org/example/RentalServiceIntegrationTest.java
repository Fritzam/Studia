package org.example;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.time.LocalDate;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;


@SpringBootTest
public class RentalServiceIntegrationTest {

    @MockBean
    private CarStorage carStorage;

    @MockBean
    private RentalStorage rentalStorage;

    @Autowired
    private RentalService rentalService;

    @Test
    void shouldCalculateEstimatedPrice() {
        //GIVEN
        Car value = new Car("make", "model", "adasdsadsad", Klasa.PREMIUM);
        when(carStorage.findCarByVin(anyString())).thenReturn(Optional.of(value));
        //WHEN
        double estimatePrice = rentalService.estimatePrice("dadad", LocalDate.now(), LocalDate.now().plusDays(3));
        //THEN
        assertThat(estimatePrice).isEqualTo(1500);
    }



}
