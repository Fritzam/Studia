/*POLECENIE: Napisz program, który będzie dokonywał konkatenacji podanego przez użytkownika stringa n razy. Liczbę n także należy pobrać od użytkownika. (1PKT) */

#include <iostream>
#include <string>

using namespace std;

/*Funkcja przyjmująca od użytkownika ciąg znaków i ilość powtórzeń, łącząca ciąg znaków n razy ze sobą
    i wyświetlająca rezultat w terminalu. */
void concat(int n, string ciag_znakow) {
    string concat_ciag_znakow;
    for (int i = 0; i < n; i++) {
        concat_ciag_znakow += ciag_znakow;
    }

    cout << concat_ciag_znakow << endl;
}



int main() {

    //Deklaracja zmiennych.
    string ciag_znakow;
    int n;

    //Prośba o ciąg znaków.
    cout << "Proszę podać ciąg znaków do konkatenacji: " << endl;
    cin >> ciag_znakow;

    //Prośba o ilość konkatenacji.
    cout << "Proszę podać liczbę konkatenacji: " << endl;
    cin >> n;

    //Wywołanie funkcji z powyższymi zmiennymi.
    concat(n, ciag_znakow);

    return 0;
}