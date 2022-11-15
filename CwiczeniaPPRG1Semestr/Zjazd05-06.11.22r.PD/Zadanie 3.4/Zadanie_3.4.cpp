#include <iostream>

using namespace std;

int factorial(int x) {
    if (x == 0) {
        return(1);
    } else {
        return(x*(factorial(x-1)));
    }
}


int main() {
    int n;
    cout << "Program rysujacy trojkat Pascala." << endl;
    cout << "Prosze podac liczbe wierszy: " << endl;
    cin >> n;
    cout << "Liczba wierszy wynosi: " << n << endl;
    cout << "-----------------------------------------" << endl;
    int result;

    for (int i = 0; i < n; i++) {
        for (int k = 0; k < i + 1; k++ ) {
            cout << (factorial(i))/(factorial(k)*factorial(i - k));
            cout << " ";
        }
        cout << endl;
    }
    cout << "-----------------------------------------" << endl;

    return 0;
}