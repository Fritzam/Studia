package Zadanie105;

class SamochodElektryczny implements Elektryczny {
    // TODO uzupełnij kod w tym miejscu! rozwiązaniem jest tylko brakujący kod!
    String marka;
    String model;
    int pozostalyZasieg;

    SamochodElektryczny(String marka, String model, int pozostalyZasieg) {
        this.marka = marka;
        this.model = model;
        this.pozostalyZasieg = pozostalyZasieg;
    }

    @Override
    public void jedz() {
        pozostalyZasieg--;
    }
    @Override
    public void ladujBaterie() {
        this.pozostalyZasieg = 100;
    }

    @Override
    public String getMarka() {
        return this.marka;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public int getPozostaloBaterii() {
        return this.pozostalyZasieg;
    }
}
