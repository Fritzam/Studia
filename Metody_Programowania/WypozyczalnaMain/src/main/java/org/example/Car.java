package org.example;

public class Car {
    public Car(String marka, String model, String vin, Klasa klasa) {
        this.vin=vin;
        this.model=model;
        this.marka=marka;
        this.klasa=klasa;
    }
    private String marka;
    private String model;
    private String vin;
    private Klasa klasa;

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public String getVin() {
        return vin;
    }
    public Klasa getKlasa() {
        return klasa;
    }
    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", vin='" + vin + '\'' +
                ", klasa=" + klasa +
                '}';
    }


}
