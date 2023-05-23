package Zadanie1041;

class Osoba implements Przywitanie{
    private String imie;

    public Osoba(String imie) {
        this.imie = imie;
    }

    @Override
    public String getPowitanie() {
        return "Cześć, nazywam się " + imie + "!";
    }
}
