/*POLECENIE: Napisz program, w którym:
a) użytkownik poda liczbę elementów wektora;
b) pobrane zostaną od użytkownika wszystkie elementy wektora;
c) wskazana zostanie wartość elementu maksymalnego wektora;
d) Wskazany zostanie numer indeksu elementu maksymalnego. (2PKT) */

#include <iostream>
#include <vector>

using namespace std;

int main() {
    //Deklaracja zmiennych
    int ilosc_elementow;
    int element;
    int najwiekszy_element;
    int indeks_największego_elementu;

    //Pozyskanie od użytkownika ilości elementów wektora.
    cout << "Proszę podać ilość elementów wektora: " << endl;
    cin >> ilosc_elementow;

    //Zainicjalizowanie wektora.
    vector <int> wektor(ilosc_elementow);

    //Pozyskanie elementu od użytkownika i wstawienie go do wektora.
    for (int i = 0; i < ilosc_elementow; i++) {
        cout << "Proszę podać " << i + 1 << " element." << endl;
        cin >> element;
        wektor[i] = element;
    };

    //Przypisanie największemu elementowi wartości początkowej.
    najwiekszy_element = wektor[0];

    //Odnalezienie największego elementu wektora.
    for (int i = 0; i < wektor.size(); i++) {
        if (wektor[i] > najwiekszy_element) {
            najwiekszy_element = wektor[i];
        }
    };

    //Odnalezienie indeksu największego elementu.
    for (int i = 0; i < wektor.size(); i++) {
        if (wektor[i] == najwiekszy_element) {
            indeks_największego_elementu = i;
        }
    };

    cout << "Największy element wynosi: " << najwiekszy_element << endl;
    cout << "Indeks największego elementu to: " << indeks_największego_elementu << endl;

    return 0;
}