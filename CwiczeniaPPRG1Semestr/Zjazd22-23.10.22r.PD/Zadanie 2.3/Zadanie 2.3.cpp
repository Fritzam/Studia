#include <iostream>

using namespace std;

int main() {
    
    int numer_miesiaca;
    cout << "Prosze wybrac liczbe odpowiadajaca miesiacowi (z przedzialu [1-12]): " << endl;
    cin >> numer_miesiaca;
    cout << "-----------------------------------------------------------" << endl;
    if (numer_miesiaca < 0 || numer_miesiaca > 12) {
        cout << "Wybrany numer nie zawiera sie w przedziale od 1 do 12." << endl;
    }

    switch (numer_miesiaca) {
        case 1: 
            cout << "Wybrany miesiac to Styczen." << endl;
            cout << "Styczen ma 31 dni w roku nieprzestepnym." << endl;
            cout << "W Styczniu jest pochmurno." << endl;
            break;
        case 2: 
            cout << "Wybrany miesiac to Luty." << endl;
            cout << "Luty ma 28 dni w roku nieprzestepnym." << endl;
            cout << "W Lutym jest pochmurno." << endl;
            break;
        case 3: 
            cout << "Wybrany miesiac to Marzec." << endl;
            cout << "Marzec ma 31 dni w roku nieprzestepnym." << endl;
            cout << "W Marcu jest pochmurno." << endl;
            break;
        case 4: 
            cout << "Wybrany miesiac to Kwiecien." << endl;
            cout << "Kwiecien ma 30 dni w roku nieprzestepnym." << endl;
            cout << "W Kwietniu jest slonecznie." << endl;
            break;
        case 5: 
            cout << "Wybrany miesiac to Maj." << endl;
            cout << "Maj ma 31 dni w roku nieprzestepnym." << endl;
            cout << "W Maju jest slonecznie." << endl;
            break;
        case 6: 
            cout << "Wybrany miesiac to Czerwiec." << endl;
            cout << "Czerwiec ma 30 dni w roku nieprzestepnym." << endl;
            cout << "W Czerwcu jest slonecznie." << endl;
            break;
        case 7: 
            cout << "Wybrany miesiac to Lipiec." << endl;
            cout << "Lipiec ma 31 dni w roku nieprzestepnym." << endl;
            cout << "W Lipcu jest slonecznie." << endl;
            break;
        case 8: 
            cout << "Wybrany miesiac to Sierpien." << endl;
            cout << "Sierpien ma 31 dni w roku nieprzestepnym." << endl;
            cout << "W Sierpniu jest slonecznie." << endl;
            break;
        case 9: 
            cout << "Wybrany miesiac to Wrzesien." << endl;
            cout << "Wrzesien ma 30 dni w roku nieprzestepnym." << endl;
            cout << "We Wrzesniu jest slonecznie." << endl;
            break;
        case 10: 
            cout << "Wybrany miesiac to Pazdziernik." << endl;
            cout << "Pazdziernik ma 30 dni w roku nieprzestepnym." << endl;
            cout << "W Pazdzierniku jest pochmurno." << endl;
            break;
        case 11: 
            cout << "Wybrany miesiac to Listopad." << endl;
            cout << "Listopad ma 30 dni w roku nieprzestepnym." << endl;
            cout << "W Listopadzie jest pochmurno." << endl;
            break;
        case 12: 
            cout << "Wybrany miesiac to Grudzien." << endl;
            cout << "Grudzien ma 31 dni w roku nieprzestepnym." << endl;
            cout << "W Grudniu jest pochmurno." << endl;
            break;
    }

    
    return 0;
}