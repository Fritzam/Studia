/*Napisz program, który oblicza sumę, różnicę, iloczyn i iloraz dla dwóch liczb x i y wprowadzanych z klawiatury.
W programie przyjmujemy, że liczby x i y są typu float(rzeczywistego).
Dla zmiennych x, y suma, różnica, iloczyn i iloraz należy przyjąć format wyświetlania ich na ekranie z dokładnością do dwóch miejsc po kropce. (1PKT)*/

#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    float x;
    float y;

    cout << "Prosze podac wartosci x i y: " << endl;
    cin >> x >> y;

    cout << "--------------------------------------" << endl;

    float dodawanie = x + y;
    float odejmowanie = x - y;
    float mnozenie = x * y;
    float dzielenie = x / y;

    cout << "Dodawanie: " << fixed << setprecision(2) << dodawanie << endl;
    cout << "Odejmowanie: " << fixed << setprecision(2) << odejmowanie << endl;
    cout << "Mnozenie: " << fixed << setprecision(2) << mnozenie << endl;
    if (x == 0 || y == 0) {
        cout << "Dzielenie: " << "Nie mozna dzielic przez 0." << endl;
    } else {
        cout << "Dzielenie: " << fixed << setprecision(2) << dzielenie << endl;
    }
    return 0;
}