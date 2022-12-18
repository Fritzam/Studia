#include <iostream>
#include <vector>

using namespace std;

int main() {
    int n;
    cout << "Proszę podać liczbę do której ma być generowany program." >> endl;
    cin >> n;
    vector <int> liczby;
    
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if ((i % 3 != 0) && (i % 5 == 0)) {
                liczby.push_back(j);
            }

        }
    }

    

    return 0;
}