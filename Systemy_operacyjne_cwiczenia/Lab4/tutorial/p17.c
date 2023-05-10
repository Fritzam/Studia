#include <stdio.h>

int main() {

    int liczba;
    printf("Podaj liczbę całkowitą\n");
    scanf("%d", &liczba);
    if (liczba % 2 == 0) {
        printf("Liczba parzysta. \n");
    } else {
        printf("Liczba nieparzysta \n");
    }


    return 0;
}