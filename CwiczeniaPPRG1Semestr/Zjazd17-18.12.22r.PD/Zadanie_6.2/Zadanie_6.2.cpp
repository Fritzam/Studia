/*POLECENIE: Napisz program, który będzie symulował grupę 6 uczniów z kilku równoległych klas i ich wyniki w nauce z czterech przedmiotów.
Program powinien wczytać sześciu uczniów o następujących właściwościach:
•imię ucznia;
•oceny z informatyki, matematyki, biologii i języka polskiego,a potem odpowiadał na pytania o ocenę z danego przedmiotu, gdzie najpierw pobiera od użytkownika numer ucznia, a następnie –numer przedmiotu. (2PKT)*/

#include <iostream>
#include <string>
#include <cstdlib>
#include <array>
#include <vector>

using namespace std;

//Inicjalizacja struktury uczen.
struct uczen {
    string imie_ucznia;
    int ocena_z_informatyki;
    int ocena_z_matematyki;
    int ocena_z_biologii;
    int ocena_z_jezyka_polskiego;
};

//Funkcja generująca losową ocenę.
int generuj_losowa_ocene() {
    int output = 1 + (rand() % (int)(6 - 1 + 1));
    return output;
}


int main() {
    //Deklaracja zmiennych.
    int wybor_ucznia;
    int wybor_przedmiotu;

    //Inicjalizacja array potrzebnych do łatwego wywoływania imion i przedmiotów.
    array <string, 6> imiona = {"Alicja", "Marta", "Agnieszka", "Maciek", "Wojtek", "Marek"};
    array <string, 4> przedmioty = {"Informatyka", "Matematyka", "Biologia", "Język Polski"};

    //Deklaracja 6 instancji struktury uczen.
    struct uczen uczen1, uczen2, uczen3, uczen4, uczen5, uczen6;

    //Deklaracja wektora uczniowie.
    vector <uczen> uczniowie;

    //Inicjalizacja dla każdej instacji ucznia.
    uczen1 = {imiona[0], generuj_losowa_ocene(), generuj_losowa_ocene(), generuj_losowa_ocene(), generuj_losowa_ocene()};
    uczen2 = {imiona[1], generuj_losowa_ocene(), generuj_losowa_ocene(), generuj_losowa_ocene(), generuj_losowa_ocene()};
    uczen3 = {imiona[2], generuj_losowa_ocene(), generuj_losowa_ocene(), generuj_losowa_ocene(), generuj_losowa_ocene()};
    uczen4 = {imiona[3], generuj_losowa_ocene(), generuj_losowa_ocene(), generuj_losowa_ocene(), generuj_losowa_ocene()};
    uczen5 = {imiona[4], generuj_losowa_ocene(), generuj_losowa_ocene(), generuj_losowa_ocene(), generuj_losowa_ocene()};
    uczen6 = {imiona[5], generuj_losowa_ocene(), generuj_losowa_ocene(), generuj_losowa_ocene(), generuj_losowa_ocene()};

    //Ręczne wepchnięcie instacji ucznia do wektora.
    //*Chciałem to zrobić pętlą na zasadzie for(i = 0 etc) {uczniowie.push_back(uczen[i]), ale zabrakło mi pomysłu jak to zrobić, a czas nagli.}*
    uczniowie.push_back(uczen1);
    uczniowie.push_back(uczen2);
    uczniowie.push_back(uczen3);
    uczniowie.push_back(uczen4);
    uczniowie.push_back(uczen5);
    uczniowie.push_back(uczen6);

    //Wyświetlenie listy dostępnych uczniów.
    cout << "Wpisz numer ucznia i oceny, które chcesz uzyskać." << endl;
    cout << "------------------------------------------------------------------" << endl;
    for (int i = 1; i <= 6; i++) {
        cout << imiona[i - 1] << " ma numer: " << i << endl;
    }

    cout << "------------------------------------------------------------------" << endl;

     //Pobranie numeru konkretnego z uczniów.
    cout << "Wprowadź numer: " << endl;
    cin >> wybor_ucznia;
    cout << "------------------------------------------------------------------" << endl;

    //Wyświetlenie wyboru użytkownika i sprawdzenie, czy jego zmienna mieści się w założeniach.
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

    //Wyświetlenie listy dostępnych przedmiotów.
    cout << "Wprowadź numer, aby uzyskać ocenę z przedmiotu." << endl;
    for (int i = 1; i <= 4; i++) {
        cout << przedmioty[i - 1] << " ma numer: " << i << endl;
    }
    cout << "------------------------------------------------------------------" << endl;

    //Pobranie zmiennej wskazującej na przedmiot od użytkownika.
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

    //Wyświetlenie wybranego przez użytkownika ucznia i przedmiotu.
    cout << "Uczen: " << uczniowie[wybor_ucznia - 1].imie_ucznia << endl;
    cout << "Przedmiot: " << przedmioty[wybor_przedmiotu - 1] << endl;

    //Wyświetlenie oceny z przedmiotu wybranego ucznia.
    /*Chciałem wyświetlić ocenę użytkownika tak jak wyżej jego imię, ale nie wiem jak to sprząc z jakąś zmienną,
        więc musiałem się posłużyć switchem dla wyświetlenia oceny ze struktury. */
    switch (wybor_przedmiotu) {
        case 1:
            cout << "Ocena: " << uczniowie[wybor_ucznia - 1].ocena_z_informatyki << endl;
            break;
        case 2:
            cout << "Ocena: " << uczniowie[wybor_ucznia - 1].ocena_z_matematyki << endl;
            break;
        case 3:
            cout << "Ocena: " << uczniowie[wybor_ucznia - 1].ocena_z_biologii << endl;
            break;
        case 4:
            cout << "Ocena: " << uczniowie[wybor_ucznia - 1].ocena_z_jezyka_polskiego << endl;
            break;
    }

    cout << "------------------------------------------------------------------" << endl;

    return 0;
}