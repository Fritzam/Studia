package org.example;

import java.util.*;

public class CarStorage {
    private CarStorage() {
    }


//    SINGLETON KURDE
    private static CarStorage carStorage = null;
    public static CarStorage getInstance() {
        if (carStorage == null) carStorage = new CarStorage();
        return carStorage;
    }
//    KONIEC SINGLETONA

    private List<Car> carList = new ArrayList<>();

    public void add(Car car) {
        carList.add(car);
    }

    public List<Car> getAll() {
//        for ( Car car : carList){
//            System.out.println(car.getKlasa());
//        }
        return carList;
    }


}
