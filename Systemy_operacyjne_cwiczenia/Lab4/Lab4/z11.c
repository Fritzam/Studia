#include <stdio.h>

int main() {

    float suma = 0;
    float liczba;
    int kontynuacja = 1;
    while (kontynuacja) {
        printf("Proszę podać liczbę do zsumowania\n");
        scanf("%f", &liczba);
        suma = suma + liczba;
        printf("Suma wynosi: %f \n", suma);
        printf("Czy chcesz kontynuować sumowanie? Wpisz '1' jeśli tak, '0' jesli nie.\n");
        scanf("%d", &kontynuacja);
    }
    printf("Finalna suma wyniosła: %f", suma);



    return 0;
}