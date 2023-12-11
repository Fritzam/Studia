package org.example;

import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class CarStorage {

    private List<Car> carList = new ArrayList<>();

    public Optional<Car> findCarByVin(String vin) {
        return carList.stream()
                .filter(car -> car.getVin().equals(vin))
                .findFirst();
    }

    public void add(Car car) {
        carList.add(car);
    }

    public void purgeList() {
        carList.clear();
    }

    public List<Car> getAll() {
        return carList;
    }


}
