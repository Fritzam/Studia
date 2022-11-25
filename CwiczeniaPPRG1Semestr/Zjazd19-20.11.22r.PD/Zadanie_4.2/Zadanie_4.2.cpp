#include <iostream>

using namespace std;

int najczestszy_element(int tablica[], int ilosc_elementow) {
   int tablica_najczestszych_elementow[ilosc_elementow][2];
   int ilosc_powtorzen = 0;
   int najwiekszy_element[1][2] = {0, 0};
   for (int i = 0; i < ilosc_elementow; i++) {
    for (int j = 0; j < ilosc_elementow; j++) {
        if (tablica[i] == tablica[j]) {
            ilosc_powtorzen++;
        }
    }
    tablica_najczestszych_elementow[i][0] = tablica[i];
    tablica_najczestszych_elementow[i][1] = ilosc_powtorzen;
    ilosc_powtorzen = 0;
   }

   for (int i = 0; i < ilosc_elementow; i++) {
    cout << "Element: " << tablica_najczestszych_elementow[i][0]<< " powtarza sie: "<< tablica_najczestszych_elementow[i][1] << " razy." << endl;
   }
   for (int i = 0; i < ilosc_elementow; i++) {
    if (tablica_najczestszych_elementow[i][1] > najwiekszy_element[0][1]) {
        najwiekszy_element[0][1] = tablica_najczestszych_elementow[i][1];
        najwiekszy_element[0][0] = tablica_najczestszych_elementow[i][0];
    }
   }
   cout << "-----------------------------------------" << endl;
   cout << "Najczesciej powtarzajacym sie elementem jest: " << najwiekszy_element[0][0] << ", ktory powtarza sie: " << najwiekszy_element[0][1] << " razy." << endl;
   cout << "-----------------------------------------" << endl;
   return 0;
}


int main() {
    int ilosc_elementow;
    int element_tabeli;

    cout << "Prosze podac ilosc elementow tablicy: " << endl;
    cin >> ilosc_elementow;
    int tablica_liczb[ilosc_elementow];
    cout << "-----------------------------------------" << endl;

    for (int i = 0; i < ilosc_elementow; i++) {
        cout << "Prosze podac " << i + 1 << " element tabeli: " << endl;
        cin >> element_tabeli;
        tablica_liczb[i] = element_tabeli;
        cout << "-----------------------------------------" << endl;
    }

    for (int i = 0; i < ilosc_elementow; i++) {
        cout << i + 1 << " element tabeli to: " << tablica_liczb[i] << "." << endl;
    }
    cout << "-----------------------------------------" << endl;
    najczestszy_element(tablica_liczb, ilosc_elementow);


    return 0;
}


