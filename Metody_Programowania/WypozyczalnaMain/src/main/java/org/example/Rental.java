package org.example;
import java.time.LocalDate;
public class Rental {
    // kto wypozycza user
    // co wypozycza car
    // od kiedy 1 data
    // do kiedy 2 data

    public Rental(User user, Car car, LocalDate dateStart, LocalDate dateEnd) {
        this.user=user;
        this.car=car;
        this.dateStart=dateStart;
        this.dateEnd=dateEnd;
    }

    private User user;
    private Car car;
    private LocalDate dateStart;
    private LocalDate dateEnd;

    public User getUser(){
        return user;
    }

    public Car getCar() {
        return car;
    }

    public LocalDate getEndDate() {
        return dateEnd;
    }

    public LocalDate getStartDate() {
        return dateStart;
    }
}
