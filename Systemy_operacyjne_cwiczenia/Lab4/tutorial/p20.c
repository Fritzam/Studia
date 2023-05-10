#include <stdio.h>

int main() {

    char a;
    printf("Podaj literę: \n");
    scanf("%c", &a);
    while(a!=0) {
        printf(".");
        a--;
    }
    printf("\n");


    return 0;
}