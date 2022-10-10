#include <iostream>
#include <string>

using namespace std;

int main()
{
    //Pozyskiwanie wartości do zmiennych od użytkownika.
    string imie;
    int numer_indeksu;
    cout << "Proszę podać imię użytkownika: " << endl;
    cin >> imie;
    cout << "Proszę podać numer indeksu: " << endl;
    cin >> numer_indeksu;

    //Realizacja zadania
    cout << "Imię użytkownika to: " << imie << '.' << endl;
    cout << "Indeks użytkownika to: " << 's' << numer_indeksu << '.' << endl;
    cout << "Polsko-Japońska Akademia Technik Komputerowych" << endl;

    return 0;
}