package Zadanie105;

public class Main {
    public static void main(String[] args) {
        /*(inherit) Dodaj brakujący kod
        Nie używaj print
        ./inherit ➞ WYDRUKUJE:
        Marka: Tesla
        Model: Model S
        Pozostały zasięg: około 100 km
        Pozostały zasięg: około 99 km
        Pozostały zasięg: około 100 km
        */


        SamochodElektryczny tesla = new SamochodElektryczny("Tesla", "Model S", 100);
        System.out.println("Marka: " + tesla.getMarka());
        System.out.println("Model: " + tesla.getModel());
        tesla.wyswietlPozostalyZasieg();
        tesla.jedz();
        tesla.wyswietlPozostalyZasieg();
        tesla.ladujBaterie();
        tesla.wyswietlPozostalyZasieg();
    }
}
