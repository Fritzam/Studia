#include <iostream>

using namespace std;

int main() {
    int suma_szeregu = 0;
    int ostatni_element_szeregu = 0;

    cout << "Prosze podac ostatni element szeregu: " << endl;
    cin >> ostatni_element_szeregu;

    for (int i = 1; i <= ostatni_element_szeregu; i++) {
        suma_szeregu += i;
    }
    cout << "Suma wszystkich elementów szeregu wynosi: " << suma_szeregu << endl;
    return 0;
}