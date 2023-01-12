/*POLECENIE: Napisz program, który będzie rozwiązywał równanie kwadratowe:
a)Wypisze na konsolę, jaką postać ma równanie kwadratowe.
b)Pobierze od użytkownika liczby A, B i C.
c)Wypisze postać równania kwadratowego z uwzględnieniem wartości dla A, B i C.
d)Obliczy i wypisze pierwiastki równania. (1 PKT) */

#include <iostream>
#include <cmath>

using namespace std;

int main() {

    float A, B, C;
    float delta;
    float x1, x2;

    cout << "Rownanie kwadratowe ma postac Ax + By + C = 0" << endl;
    cout << "-----------------------------------------------" << endl;
    cout << "Prosze podac liczby A, B i C:" << endl;
    cin >> A >> B >> C;
    cout << endl;
    cout << "-----------------------------------------------" << endl;
    cout << "Wybrane liczby to: " << "A = "<< A << ", B = " << B << ", C = " << C << endl;
    cout << endl;
    cout << "Rownanie kwadratowe dla tych liczb ma postac: " << endl;
    cout << A << "x + " << B << "y + " << C << " = " << " 0" << endl;
    cout << "----------------------------------------------" << endl;
    cout << endl;
    delta = B*B - 4*A*C;
    cout << "Delta wynosi: " << delta << endl;
    cout << endl;
    if(delta > 0) {
            cout << "Dla delty wiekszej od 0 istnieja dwa rozwiazania: " << endl;
            x1 = (-B - sqrt(delta))/(2*A);
            x2 = (-B + sqrt(delta))/(2*A);
            cout << "Rozwiazanie pierwsze wynosi: " << x1 << endl;
            cout << "Rozwiazanie drugie wynosi: " << x2 << endl;
    }
    else if(delta == 0) {
            cout << "Nie istnieje rozwiazanie dla delty wynoszacej 0." << endl;
    }
    else if(delta < 0) {
            x1 = -B/(2*A);
            cout << "Dla delty mniejszej od 0 istnieje jedno rozwiazanie: " << endl;
            cout << "Rozwiazanie wynosi: " << x1 << endl;
    }
    cout << "-----------------------------------------------" << endl;
    return 0;
}