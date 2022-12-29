#include <iostream>

using namespace std;

int main() {
    int matrix[10][10];
    for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
            if (i == 0) {
                matrix[j][0] = j;
            }
            else if (i == 1 ) {
                matrix[j][1] = j*2;
            }
            else if (i == 2) {
                matrix[j][2] = j*j;
            }
            else if (i == 3) {
                matrix[j][3] = j+3;
            }
            else if (i == 4) {
                matrix[j][4] = j-4;
            }
            else if (i >= 5) {
                matrix[j][i] = 0;
            }
        }
    }



    //Printing matrix
    for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
            cout << matrix[i][j] << " ";
        }
        cout << endl;
    }
    return 0;
}