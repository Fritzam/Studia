#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    float x;
    float y;

    cout << "Prosze podac wartosci x i y: " << endl;
    cin >> x >> y;

    float dodawanie = x + y;
    float odejmowanie = x - y;
    float mnożenie = x * y;
    float dzielenie = x / y;
    cout << "Dodawanie: " << dodawanie << setprecision(2) << endl;
    cout << "Odejmowanie: " << odejmowanie << setprecision(2) << endl;
    cout << "Mnozenie: " << mnożenie << setprecision(2) << endl;
    if (x == 0 || y == 0) {
        cout << "Dzielenie: " << "Nie mozna dzielic przez 0." << endl;
    } else {
        cout << "Dzielenie: " << x / y << endl;
    }
    return 0;
}