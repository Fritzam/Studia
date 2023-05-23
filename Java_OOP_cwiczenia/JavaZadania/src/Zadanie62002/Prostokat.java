package Zadanie62002;

class Prostokat {
    private float dlugosc;
    private float szerokosc;

    public void setDlugosc(float dlugosc) {
        this.dlugosc = dlugosc;
    }

    public void setSzerokosc(float szerokosc) {
        this.szerokosc = szerokosc;
    }

    public float polePowierzchni() {
        return dlugosc * szerokosc;
    }

    public float getDlugosc() {
        return this.dlugosc;
    }

    public float getSzerokosc() {
        return this.szerokosc;
    }
}
