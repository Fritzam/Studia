//POLECENIE: Napisz program, który sprawdzi, czy podana liczba całkowita jest parzysta, nieparzysta, czy żadna (0). ​(1 PKT)

#include <iostream>

using namespace std;

int main() {
    //Pobranie wartości od użytkownika.
    int liczba;
    cout << "Proszę podać liczbę: " << endl;
    cin >> liczba;

    //Sprawdzenie czy liczba jest parzysta, nieparzysta, lub żadna.
    if (liczba == 0) {
        cout << "Liczba jest zerem, lub wartością nieprzewidzianą przez twórcę programu." << endl;
    }
    else if (liczba % 2 != 0) {
        cout << "Liczba " << liczba << " jest liczbą nieparzystą." << endl;
    }
    else {
        cout << "Liczba " << liczba << " jest liczbą parzystą." << endl;
    }
    return 0;
}