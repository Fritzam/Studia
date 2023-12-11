package org.example;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class RentalServiceMockTest {

    @Mock
    private CarStorage carStorage;

    @Mock
    private RentalStorage rentalStorage;

    @InjectMocks
    private RentalService rentalService;

    @Test
    void shouldCalculateEstimatedPrice() {
        //GIVEN
        Car value = new Car("make", "model", "adasdsadsad", Klasa.PREMIUM);
        when(carStorage.findCarByVin(anyString())).thenReturn(Optional.of(value));
        //WHEN
        double estimatePrice = rentalService.estimatePrice("dadad", LocalDate.now(), LocalDate.now().plusDays(3));
        //THEN
        assertThat(estimatePrice).isEqualTo(45000);
    }



}
