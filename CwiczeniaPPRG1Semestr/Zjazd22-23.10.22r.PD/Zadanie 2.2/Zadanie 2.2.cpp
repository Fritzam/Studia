/*POLECENIE: Napisz program, który: (1PKT)
A) Pobierze od Użytkownika liczb "a" oraz "b" oraz wypisze je na ekran.
B) Wypisze wiersz gwiazdek o długości "a".
C) Wypisze kolumnę gwiazdek o długości "b".
D) Wypisze wypełniony prostokąt gwiazdek o wymiarach "a" na "b".
E) Wypisze obwód (obramowanie) prostokątu gwiazdek o wymiarach "a" na "b".
**DLA DODATKOWYCH PUNKTÓW** (+2PKT)
Wypisze trójkąt prostokątny równoramienny:
•o pionowej przyprostokątnej o długości "a" oraz poziomej przyprostokątnej o długości TAKŻE "a".
•liczba gwiazdek w kolejnych wierszach: 1, 2, 3, ..., a-1, a.
•kąt prosty w trójkącie: lewy dolny róg.G*) Jak w podpunkcie F, ale:
•liczba gwiazdek w kolejnych wierszach NA ODWRÓT: a, a-1, ..., 3, 2, 1;
•kąt prosty w trójkącie: prawy górny róg. */



#include <iostream>

using namespace std;

int main() {
    int a, b;

    //Zapytanie o wartości do zmiennych.
    cout << "Prosze podac liczby a i b: " << endl;
    cout << endl;

    //Przyjęcie wartości od użytkownika.
    cin >> a >> b;

    cout << endl;
    cout << endl;

    //Kod na wiersze o długosci a.
    cout << "Wiersz o dlugości a: " << endl;
    for(int i = 0; i < a; i++) {
        cout << "*";
    }

    cout << endl;
    cout << endl;

    //Kod na kolumny o długości b.
    cout << "Kolumna o dlugosci b: " << endl;
    for (int i = 0; i < b; i++) {
        cout << "*" << endl;
    }

    cout << endl;
    cout << endl;

    //Kod na prostokąt o wymiarach a i b.
    cout << "Prostokat o wymiarach a i b: " <<endl;
    for (int i = 0; i < b; i++) {
        for (int j = 0; j < a; j++) {
            cout << "*";
        }
        cout << endl;
    }

    cout << endl;
    cout << endl;

    //Kod na obwód prostokąta o wymiarach a i b.
    cout << "Obwod prostokata o wymiarach a i b: " << endl;
    for (int i = 0; i < b; i++) {
        for (int j = 0; j < a; j++) {
            if (i == 0 || i == b - 1) {
                cout << "*";
            } else {
                if (j == 0 || j == a - 1) {
                    cout << "*";
                } else {
                    cout << " ";
                }
            }
        }
        cout << endl;
    }

    cout << endl;
    cout << endl;

    //Kod na wypisanie trójkąta rownoramiennego o długości boku a.
    cout << "Trojkat rownoramienny o wymiarach a: " << endl;
    for (int i = 1; i <= a; i++) {
        for (int j = 1; j <= i; j++) {
            cout << "*";
        }
        cout << endl;
    }

    cout << endl;
    cout << endl;

    //Kod na wypisanie trójkąta równoramiennego o długości a odwrotnie:
    cout << "Odwrocony trojkat rownoramienny o wymiarach a: " << endl;
    for (int i = 0; i < a; i++) {
        if (i != a) {
            for (int k = 0; k < i; k++) {
                cout << " ";
            }
        }
        for (int j = a; j > i; j--) {
            cout << "*";
        }
        cout << endl;
    }

    return 0;
}