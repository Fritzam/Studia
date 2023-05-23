package Zadanie62003;

public class Prostokat {
    private float dlugosc;
    private float szerokosc;

    public Prostokat(float dlugosc, float szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    public float polePowierzchni() {
        return dlugosc * szerokosc;
    }
}
