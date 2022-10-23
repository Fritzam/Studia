/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

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
