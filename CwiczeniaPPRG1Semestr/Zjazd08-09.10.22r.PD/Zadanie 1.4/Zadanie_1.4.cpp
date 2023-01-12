//POLECENIE: Napisz program do znajdowania największej liczby wśród trzech liczb, podanych przez użytkownika. (1PKT)

#include <iostream>
using namespace std;

int main() {
    int x, y, z;
    cout << "Wprowadź liczbę x" << endl;
    cin >> x;
    cout << "Wprowadź liczbę y" << endl;
    cin >> y;
    cout << "Wprowadź liczbę z" << endl;
    cin >> z;
    if (x > y && x > z) {
        cout << "Największa jest liczba x wynosząca: " << x << endl;
    }
    if (y > x && y > z) {
        cout << "Największa jest liczba y wynosząca: " << y << endl;
    }
    if (z > x && z > y) {
        cout << "Największa jest liczba z wynosząca: " << z << endl;
    }
    return 0;
    }