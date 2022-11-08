#include <iostream>

using namespace std;

int main() {
    char znak;
    cout << "Prosze wpisywac znaki, znak t przerwie prace programu." << endl;
    while (znak != 't') {
        cin >> znak;
        cout << znak;
    }

    return 0;
}