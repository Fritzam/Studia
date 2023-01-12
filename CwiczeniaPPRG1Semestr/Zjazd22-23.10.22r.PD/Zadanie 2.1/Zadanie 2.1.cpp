//POLECENIE: Napisz program do obliczania szeregu wg podanego wzoru: (1)+ (1+2) + (1+2+3) + (1+2+3+4) + ... + (1+2+3+4+...+n).(1 pkt)

#include <iostream>

using namespace std;

int main() {
    int liczba;
    int suma_szeregu = 0;

    cout << "Dla jakiej liczby liczymy sumę szeregu?" << endl;
    cin >> liczba;

    for (int i = 1; i <= liczba; i++) {
        for (int j = 1; j <= i; j++) {
            suma_szeregu += j;
        }
    }
    cout << "Suma szeregu wynosi: " << suma_szeregu << endl;

    return 0;
}