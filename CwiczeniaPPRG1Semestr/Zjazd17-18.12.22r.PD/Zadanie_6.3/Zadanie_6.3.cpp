#include <iostream>
#include <vector>
#include <string>
#include <array>
using namespace std;

//Deklaracja struktury Student.
struct Student {
    string imie;
    string nazwisko;
    int numer_indeksu;
};

//Funkcja sortująca wektor w oparciu o numer w indeksie. Paskudna, wiem, ale jestem z niej dumny.
void sort(vector <Student>& Studenci) {
    for (int i = 0; i < Studenci.size(); i++) {
        vector <Student> swap;
        for (int j = 0; j < Studenci.size(); j++) {
            if (Studenci[j].numer_indeksu > Studenci[i].numer_indeksu) {
                swap.push_back(Studenci[j]);
                Studenci[j] = Studenci[i];
                Studenci[i] = swap[0];
                swap.pop_back();

            }
        }
    }

}

//Funkcja wyświetlająca wszystkie elementy wektora.
void display(vector <Student> Studenci) {
    for (int i = 0; i < Studenci.size(); i++) {
        cout << Studenci[i].imie << " " << Studenci[i].nazwisko << endl;
        cout << "Numer indeksu: " << Studenci[i].numer_indeksu << endl;
        cout << "--------------------------------------" << endl;
    }
}

//Funkcja wyświetlająca konkretny element wektora.
void disp_part(int n, vector <Student> Studenci) {

    cout << Studenci[n].imie << " " << Studenci[n].nazwisko << endl;
    cout << "Numer indeksu: " << Studenci[n].numer_indeksu << endl;
    cout << "--------------------------------------" << endl;
}



int main() {

//Deklaracja struktury.
vector <Student> Studenci;
//Inicjalizacja 6 instancji struktury student.
struct Student s1, s2, s3, s4, s5, s6;

//Przypisanie wartości zmiennym struktury.
s1 = {"Alicja", "Alicjanska", 21248};
s2 = {"Marta", "Markowska", 48192};
s3 = {"Agnieszka", "Agnieszkowska", 17239};
s4 = {"Wojtek", "Wojtkowski", 141278};
s5 = {"Maciej", "Mackowski", 90214};
s6 = {"Marek", "Markowski", 30471};

//Pchnięcie zmiennych do wektora Studenci.
Studenci.push_back(s1);
Studenci.push_back(s2);
Studenci.push_back(s3);
Studenci.push_back(s4);
Studenci.push_back(s5);
Studenci.push_back(s6);

//Wykonanie funkcji sort i display.
sort(Studenci);
display(Studenci);


//Deklaracja struktury.
vector <Student> Studenci2;
//Inicjalizacja 6 instancji struktury student.
struct Student z1, z2, z3, z4, z5, z6;

//Przypisanie wartości zmiennym struktury.
z1 = {"a", "a", 16580};
z2 = {"b", "b", 1454};
z3 = {"c" ,"c", 59826};
z4 = {"d", "d", 7669};
z5 = {"e", "e", 59724};
z6 = {"f", "f", 303};

//Pchnięcie wartości do drugiego wektora.
Studenci2.push_back(z1);
Studenci2.push_back(z2);
Studenci2.push_back(z3);
Studenci2.push_back(z4);
Studenci2.push_back(z5);
Studenci2.push_back(z6);


cout << "--------------------------------------" << endl;
cout << "PRÓBA DRUGA" << endl;
cout << "--------------------------------------" << endl;
cout << "--------------------------------------" << endl;

//Wykonanie programu.
sort(Studenci2);
display(Studenci2);

cout << "--------------------------------------" << endl;
cout << "PRÓBA TRZECIA" << endl;

//Deklaracja wektora i inicjalizacja zmiennych struktury.
vector <Student> Studenci3;
struct Student y1, y2, y3, y4, y5, y6;

//Przypisanie wartości zmiennym struktury.
y1 = {"a", "a", 22789};
y2 = {"b", "b", 79344};
y3 = {"c" ,"c", 92709};
y4 = {"d", "d", 4556};
y5 = {"e", "e", 8496};
y6 = {"f", "f", 60188};

//Pchnięcie wartości do trzeciej struktury.
Studenci3.push_back(y1);
Studenci3.push_back(y2);
Studenci3.push_back(y3);
Studenci3.push_back(y4);
Studenci3.push_back(y5);
Studenci3.push_back(y6);

//Wykonanie programu.
sort(Studenci3);
display(Studenci3);

cout << "--------------------------------------" << endl;



    return 0;
}