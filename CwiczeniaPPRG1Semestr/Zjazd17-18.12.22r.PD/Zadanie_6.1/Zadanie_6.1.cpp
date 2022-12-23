#include <iostream>
#include <vector>

using namespace std;

//Funkcja zliczająca ilość liczb od 5 do n ktore są podzielne przez 5, lecz nie przez 3.
int sprawdzenie_ilosci_liczb(int n) {
    int liczba = 0;
    for (int i = 5; i < n; i += 5) {
        if (i % 3 != 0) {
            liczba++;
        }
    }

    return liczba;
}

//Funkcja wyświetlająca te liczby na standard output.
void wyswietlenie_poszczegolnych_liczb(vector <int> wektor) {
    for (int i = 0; i < wektor.size(); i++) {
        cout << i+1 << " element podzielny przez 5, lecz niepodzielny przez 3 to : " << wektor[i] << endl;
    }
}

//Funkcja dodająca te liczby do wektora.
void dodanie_do_wektora(vector <int>& wektor, int n) {
    for (int i = 5; i < n; i += 5) {
        if (i % 3 != 0) {
            wektor.push_back(i);
        }
    }

}




int main() {

    //Pozyskanie zasięgu sprawdzanych liczb i zapisanie go do zmiennej.
    int n;
    cout << "Proszę podać liczbę do której mam sprawdzić liczby podzielne przez 5, lecz niepodzielne przez 3." << endl;
    cin >> n;

    //Deklaracja wektora.
    vector <int> przez_piec;

    //Wywołanie funkcji.
    dodanie_do_wektora(przez_piec, n);
    wyswietlenie_poszczegolnych_liczb(przez_piec);

    //Wypisanie podsumowania na ekranie.
    cout << "-----------------------------------------------------------" << endl;
    cout << "Ilość liczb podzielnych przez 5, lecz niepodzielnych przez 3 mniejszych niż " << n << " wynosi: " << sprawdzenie_ilosci_liczb(n) << endl;
    cout << "-----------------------------------------------------------" << endl;

    return 0;
}