//POLECENIE: Napisz program, który sprawdzi, czy liczba całkowita jest dodatnia, ujemna czy może jest 0. (1 pkt)​

#include <iostream>

using namespace std;

int main() {
    //Pobranie liczby od użytkownika.
    int liczba;
    cout << "Proszę podać liczbę: " << endl;
    cin >> liczba;

    //Sprawdzenie czy liczba jest liczbą dodatnią, zerem(inną wartością), lub liczbą ujemną.
    if (liczba > 0) {
        cout << "Liczba " << liczba << " jest liczbą dodatnią." << endl;
    }
    else if (liczba == 0) {
        cout << "Liczba jest zerem, lub wartością nieprzewidzianą przez twórcę programu." << endl;
    }
    else if (liczba < 0){
        cout << "Liczba " << liczba << " jest liczbą ujemną." << endl;
    }
    return 0;
}