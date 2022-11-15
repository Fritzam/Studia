#include <iostream>

using namespace std;

int main() {
    int ilosc_elementow_tablicy;
    int element_tablicy;
    int najwieksza_wartosc;

    cout << "Prosze podac ilosc elementow tablicy: " << endl;
    cin >> ilosc_elementow_tablicy;
    cout << endl;
    int tablica_liczb[ilosc_elementow_tablicy];

    for (int i = 0; i < ilosc_elementow_tablicy; i++) {
        cout << "Prosze podac " << i + 1 << " element tablicy: " << endl;
        cout << endl;
        cin >> element_tablicy;
        tablica_liczb[i] = element_tablicy;
        cout << "---------------------------------------------" << endl;
    }

    for (int k = 0; k < ilosc_elementow_tablicy; k++) {
        cout << k + 1 << " element tablicy to: " << tablica_liczb[k] << "." << endl;
    }

    cout << "---------------------------------------------" << endl;

    najwieksza_wartosc = tablica_liczb[0];

    for (int j = 0; j < ilosc_elementow_tablicy; j++) {
        if (tablica_liczb[j] > najwieksza_wartosc) {
            najwieksza_wartosc = tablica_liczb[j];
        }
    }
    cout << "---------------------------------------------" << endl;
    cout << "Najwieksza wartoscia z podanych w tablicy jest: " << najwieksza_wartosc << endl;


    return 0;
}