#include <iostream>
#include <string>

using namespace std;

void concat(int n, string ciag_znakow) {
    string concat_ciag_znakow;
    for (int i = 0; i < n; i++) {
        concat_ciag_znakow += ciag_znakow;
    }

    cout << concat_ciag_znakow << endl;
}



int main() {

    string ciag_znakow;
    int n;

    cout << "Proszę podać ciąg znaków do konkatenacji: " << endl;
    cin >> ciag_znakow;

    cout << "Proszę podać liczbę konkatenacji: " << endl;
    cin >> n;

    concat(n, ciag_znakow);

    return 0;
}