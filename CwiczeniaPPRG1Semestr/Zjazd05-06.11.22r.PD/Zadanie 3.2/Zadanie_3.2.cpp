//Napisz program, wyświetlający na ekranie znaki z klawiatury do momentu, aż zostanie podany znak „t”. (1PKT)

#include <iostream>
#include <string>

using namespace std;

int main() {
    string ciag_znakow;
    cout << "Prosze wpisac ciag znakow. Znaki \"t\" lub \"T\" przerwa prace programu." << endl;
    getline(cin, ciag_znakow);
    cout << "-----------------------------------" << endl;
    for (int i = 0; i < ciag_znakow.length(); i++) {
        if(ciag_znakow[i] == 't' || ciag_znakow[i] == 'T') {
            return 0;
        } else {
            cout << ciag_znakow[i] << endl;
        }
    }
    return 0;
}