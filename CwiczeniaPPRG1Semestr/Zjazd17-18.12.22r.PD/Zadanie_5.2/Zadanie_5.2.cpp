#include <iostream>
#include <vector>

using namespace std;

//Funkcja dodajaca podane przez użytkownika elementy do wektora.
void add_to_vector(vector <int>& wektor, int liczba_w_tablicy, int& licznik) {
    for (int i = 0; i < liczba_w_tablicy; i++) {
        int element;
        cout << "Podaj " << i + 1 << " element " << licznik << " tablicy. " << endl;
        cin >> element;
        wektor.push_back(element);
    }
    licznik++;
}

//Funkcja wyświetlająca elementy wektora na ekranie.
void display_vector(vector <int> wektor1, vector <int> wektor2) {

    for (int i = 0; i < wektor1.size(); i++) {
        cout << wektor1[i] << "         " << " | " << "         " << wektor2[i] << endl;
    }

}

//Funkcja podmieniająca odpowiadające sobie elementy wektorów tak że wek1[0] | wek2[0] --> swap --> wek2[0] | wek1[0] itd.
void swap_vectors(vector <int>& wektor1, vector <int>& wektor2) {
    for (int i = 0; i < wektor1.size(); i++) {
        int swap_variable;
        swap_variable = wektor1[i];
        wektor1[i] = wektor2[i];
        wektor2[i] = swap_variable;

    }

}
int main() {
    //Deklaracja liczb całkowitych.
    int liczba_elementow_tablicy;
    int licznik_uzyc_funkcji = 1;

    //Pobranie od użytkownika liczby elementów w tablicach.
    cout << "Podaj liczbę elementów tablic: " << endl;
    cin >> liczba_elementow_tablicy;

    //Deklaracja wektorów.
    vector <int> wektor1;
    vector <int> wektor2;

    //Wywołanie funkcji.
    add_to_vector(wektor1, liczba_elementow_tablicy, licznik_uzyc_funkcji);
    add_to_vector(wektor2, liczba_elementow_tablicy, licznik_uzyc_funkcji);
    cout << "-----------------------------------------" << endl;
    display_vector(wektor1, wektor2);
    swap_vectors(wektor1, wektor2);
    cout << "-----------------------------------------" << endl;
    display_vector(wektor1, wektor2);









    return 0;
}