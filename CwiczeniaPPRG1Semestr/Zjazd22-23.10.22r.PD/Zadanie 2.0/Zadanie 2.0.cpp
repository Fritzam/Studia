#include <iostream>
using namespace std;

int main() {
    int ilosc_gosci;
    int ilosc_kawalkow;
    
    cout << "Ilu jest gości?" << endl;
    cin >> ilosc_gosci;
    cout << "Ile jest kawałków?" << endl;
    cin >> ilosc_kawalkow;

    cout << "Ilosc kawalkow na osobe: " << ilosc_kawalkow / ilosc_gosci << endl;
    cout << "Kawalki, ktore zostana: " << ilosc_kawalkow % ilosc_gosci << endl;


    return 0;
}
