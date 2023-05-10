#include <stdio.h>

int main() {
    float a,b;
    int opcja;

    printf("Podaj liczbę a: \n");
    scanf("%f", &a);
    printf("Podaj liczbę b: \n");
    scanf("%f", &b);
    printf("Wybierz operację:\n1 - suma, 2 - iloczyn\n");
    scanf("%d", &opcja);
    if (opcja == 1){
        printf("Suma wynosi: %f", a+b);
    }
    else if (opcja == 2) {
        printf("Iloczyn wynosi: %f\n", a*b);
    }
    return 0;
}