#include <iostream>
#include <string>
#include <cstdlib>
#include <array>

using namespace std;


struct uczen {
    string imie_ucznia;
    int ocena_z_informatyki;
    int ocena_z_matematyki;
    int ocena_z_biologii;
    int ocena_z_jezyka_polskiego;
};

int generuj_losowa_ocene() {
    int output = 1 + (rand() % (int)(6 - 1 + 1));
    return output;
}


int main() {
    int wybor_ucznia;
    int wybor_przedmiotu;

    array <string, 6> imiona = {"Alicja", "Marta", "Agnieszka", "Maciek", "Wojtek", "Marek"};
    array <string, 4> przedmioty = {"Informatyka", "Matematyka", "Biologia", "Język Polski"};

    struct uczen uczen1, uczen2, uczen3, uczen4, uczen5, uczen6;

    uczen1 = {imiona[0], generuj_losowa_ocene(), generuj_losowa_ocene(), generuj_losowa_ocene(), generuj_losowa_ocene()};
    uczen2 = {imiona[1], generuj_losowa_ocene(), generuj_losowa_ocene(), generuj_losowa_ocene(), generuj_losowa_ocene()};
    uczen3 = {imiona[2], generuj_losowa_ocene(), generuj_losowa_ocene(), generuj_losowa_ocene(), generuj_losowa_ocene()};
    uczen4 = {imiona[3], generuj_losowa_ocene(), generuj_losowa_ocene(), generuj_losowa_ocene(), generuj_losowa_ocene()};
    uczen5 = {imiona[4], generuj_losowa_ocene(), generuj_losowa_ocene(), generuj_losowa_ocene(), generuj_losowa_ocene()};
    uczen6 = {imiona[5], generuj_losowa_ocene(), generuj_losowa_ocene(), generuj_losowa_ocene(), generuj_losowa_ocene()};

    cout << "Wpisz numer ucznia i oceny, które chcesz uzyskać." << endl;
    cout << "------------------------------------------------------------------" << endl;
    for (int i = 1; i <= 6; i++) {
        cout << imiona[i - 1] << " ma numer: " << i << endl;
    }

    cout << "------------------------------------------------------------------" << endl;
    cout << "Wprowadź numer: " << endl;
    cin >> wybor_ucznia;
    cout << "------------------------------------------------------------------" << endl;

    switch (wybor_ucznia) {
        case 1:
            cout << "Wybrany przez Ciebie uczeń to: " << uczen1.imie_ucznia << endl;
            break;
        case 2:
            cout << "Wybrany przez Ciebie uczeń to: " << uczen2.imie_ucznia << endl;
            break;
        case 3:
            cout << "Wybrany przez Ciebie uczeń to: " << uczen3.imie_ucznia << endl;
            break;
        case 4:
            cout << "Wybrany przez Ciebie uczeń to: " << uczen4.imie_ucznia << endl;
            break;
        case 5:
            cout << "Wybrany przez Ciebie uczeń to: " << uczen5.imie_ucznia << endl;
            break;
        case 6:
            cout << "Wybrany przez Ciebie uczeń to: " << uczen6.imie_ucznia << endl;
            break;
        default:
            cout << "Twoje wejście powinno być liczbą od 1-6, następuje przerwanie działania programu.";
            return 0;

    }

    cout << "------------------------------------------------------------------" << endl;

    cout << "Wprowadź numer, aby uzyskać ocenę z przedmiotu." << endl;
    for (int i = 1; i <= 4; i++) {
        cout << przedmioty[i - 1] << " ma numer: " << i << endl;
    }
    cout << "------------------------------------------------------------------" << endl;
    cout << "Wprowadź numer przedmiotu: " << endl;
    cin >> wybor_przedmiotu;
    switch (wybor_przedmiotu) {
        case 1:
            cout << "Wybrałeś przedmiot: " << przedmioty[0] << endl;
            break;
        case 2:
            cout << "Wybrałeś przedmiot: " << przedmioty[1] << endl;
            break;
        case 3:
            cout << "Wybrałeś przedmiot: " << przedmioty[2] << endl;
            break;
        case 4:
            cout << "Wybrałeś przedmiot: " << przedmioty[3] << endl;
            break;
        default:
            cout << "Twoje wejście powinno być liczbą od 1-4, następuje przerwanie działania programu.";
            return 0;
    }
    cout << "------------------------------------------------------------------" << endl;

    switch (wybor_ucznia) {
        case 1:
            switch (wybor_przedmiotu) {
                case 1:
                    cout << "Ocena z przedmiotu: " << przedmioty[wybor_przedmiotu - 1] << " ucznia: " << uczen1.imie_ucznia << " to: " << uczen1.ocena_z_informatyki << endl;
                    break;
                case 2:
                    cout << "Ocena z przedmiotu: " << przedmioty[wybor_przedmiotu - 1] << " ucznia: " << uczen1.imie_ucznia << " to: " << uczen1.ocena_z_matematyki << endl;
                    break;
                case 3:
                    cout << "Ocena z przedmiotu: " << przedmioty[wybor_przedmiotu - 1] << " ucznia: " << uczen1.imie_ucznia << " to: " << uczen1.ocena_z_biologii << endl;
                    break;
                case 4:
                    cout << "Ocena z przedmiotu: " << przedmioty[wybor_przedmiotu - 1] << " ucznia: " << uczen1.imie_ucznia << " to: " << uczen1.ocena_z_jezyka_polskiego << endl;
                    break;
            }
            break;

        case 2:
            switch (wybor_przedmiotu) {
                case 1:
                    cout << "Ocena z przedmiotu: " << przedmioty[wybor_przedmiotu - 1] << " ucznia: " << uczen2.imie_ucznia << " to: " << uczen2.ocena_z_informatyki << endl;
                    break;
                case 2:
                    cout << "Ocena z przedmiotu: " << przedmioty[wybor_przedmiotu - 1] << " ucznia: " << uczen2.imie_ucznia << " to: " << uczen2.ocena_z_matematyki << endl;
                    break;
                case 3:
                    cout << "Ocena z przedmiotu: " << przedmioty[wybor_przedmiotu - 1] << " ucznia: " << uczen2.imie_ucznia << " to: " << uczen2.ocena_z_biologii << endl;
                    break;
                case 4:
                    cout << "Ocena z przedmiotu: " << przedmioty[wybor_przedmiotu - 1] << " ucznia: " << uczen2.imie_ucznia << " to: " << uczen2.ocena_z_jezyka_polskiego << endl;
                    break;
            }
            break;
        case 3:
            switch (wybor_przedmiotu) {
                case 1:
                    cout << "Ocena z przedmiotu: " << przedmioty[wybor_przedmiotu - 1] << " ucznia: " << uczen3.imie_ucznia << " to: " << uczen3.ocena_z_informatyki << endl;
                    break;
                case 2:
                    cout << "Ocena z przedmiotu: " << przedmioty[wybor_przedmiotu - 1] << " ucznia: " << uczen3.imie_ucznia << " to: " << uczen3.ocena_z_matematyki << endl;
                    break;
                case 3:
                    cout << "Ocena z przedmiotu: " << przedmioty[wybor_przedmiotu - 1] << " ucznia: " << uczen3.imie_ucznia << " to: " << uczen3.ocena_z_biologii << endl;
                    break;
                case 4:
                    cout << "Ocena z przedmiotu: " << przedmioty[wybor_przedmiotu - 1] << " ucznia: " << uczen3.imie_ucznia << " tooki: " << uczen3.ocena_z_jezyka_polskiego << endl;
                    break;
            }
            break;
        case 4:
            switch (wybor_przedmiotu) {
                case 1:
                    cout << "Ocena z przedmiotu: " << przedmioty[wybor_przedmiotu - 1] << " ucznia: " << uczen4.imie_ucznia << " to: " << uczen4.ocena_z_informatyki << endl;
                    break;
                case 2:
                    cout << "Ocena z przedmiotu: " << przedmioty[wybor_przedmiotu - 1] << " ucznia: " << uczen4.imie_ucznia << " to: " << uczen4.ocena_z_matematyki << endl;
                    break;
                case 3:
                    cout << "Ocena z przedmiotu: " << przedmioty[wybor_przedmiotu - 1] << " ucznia: " << uczen4.imie_ucznia << " to: " << uczen4.ocena_z_biologii << endl;
                    break;
                case 4:
                    cout << "Ocena z przedmiotu: " << przedmioty[wybor_przedmiotu - 1] << " ucznia: " << uczen4.imie_ucznia << " to: " << uczen4.ocena_z_jezyka_polskiego << endl;
                    break;
            }
            break;
        case 5:
            switch (wybor_przedmiotu) {
                case 1:
                    cout << "Ocena z przedmiotu: " << przedmioty[wybor_przedmiotu - 1] << " ucznia: " << uczen5.imie_ucznia << " to: " << uczen5.ocena_z_informatyki << endl;
                    break;
                case 2:
                    cout << "Ocena z przedmiotu: " << przedmioty[wybor_przedmiotu - 1] << " ucznia: " << uczen5.imie_ucznia << " to: " << uczen5.ocena_z_matematyki << endl;
                    break;
                case 3:
                    cout << "Ocena z przedmiotu: " << przedmioty[wybor_przedmiotu - 1] << " ucznia: " << uczen5.imie_ucznia << " to: " << uczen5.ocena_z_biologii << endl;
                    break;
                case 4:
                    cout << "Ocena z przedmiotu: " << przedmioty[wybor_przedmiotu - 1] << " ucznia: " << uczen5.imie_ucznia << " to: " << uczen5.ocena_z_jezyka_polskiego << endl;
                    break;
            }
            break;
        case 6:
            switch (wybor_przedmiotu) {
                case 1:
                    cout << "Ocena z przedmiotu: " << przedmioty[wybor_przedmiotu - 1] << " ucznia: " << uczen6.imie_ucznia << " to: " << uczen6.ocena_z_informatyki << endl;
                    break;
                case 2:
                    cout << "Ocena z przedmiotu: " << przedmioty[wybor_przedmiotu - 1] << " ucznia: " << uczen6.imie_ucznia << " to: " << uczen6.ocena_z_matematyki << endl;
                    break;
                case 3:
                    cout << "Ocena z przedmiotu: " << przedmioty[wybor_przedmiotu - 1] << " ucznia: " << uczen6.imie_ucznia << " to: " << uczen6.ocena_z_biologii << endl;
                    break;
                case 4:
                    cout << "Ocena z przedmiotu: " << przedmioty[wybor_przedmiotu - 1] << " ucznia: " << uczen6.imie_ucznia << " to: " << uczen6.ocena_z_jezyka_polskiego << endl;
                    break;
            }
            break;
    }

    return 0;
}