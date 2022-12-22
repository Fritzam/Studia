#include <iostream>
#include <vector>

using namespace std;

int sprawdzenie_ilosci_liczb(int n) {
    int liczba = 0;
    for (int i = 5; i < n; i += 5) {
        if (i % 3 != 0) {
            liczba++;
        }
    }

    return liczba;
}

void wyswietlenie_poszczegolnych_liczb(int n) {
    vector <int> przez_piec;
    for (int i = 5; i < n; i += 5) {
        if (i % 3 != 0) {
            przez_piec.push_back(i);
        }
    }

    for (int i = 0; i < przez_piec.size(); i++) {
        cout << i+1 << " element podzielny przez 5, lecz niepodzielny przez 3 to : " << przez_piec[i] << endl;
    }
}




int main() {
    int n;
    cout << "Proszę podać liczbę." << endl;
    cin >> n;

    wyswietlenie_poszczegolnych_liczb(n);
    cout << "-----------------------------------------------------------" << endl;
    cout << "Ilość liczb podzielnych przez 5, lecz niepodzielnych przez 3 mniejszych niż " << n << " wynosi: " << sprawdzenie_ilosci_liczb(n) << endl;
    cout << "-----------------------------------------------------------" << endl;

    return 0;
}