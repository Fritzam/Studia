#include <stdio.h>

float dodawanie(float a, float b) {

    printf("Suma podanych liczb wynosi: %f\n", a+b);

}

float odejmowanie(float a, float b) {

    printf("Różnica podanych liczb wynosi: %f\n", a-b);

}

float mnozenie(float a, float b) {

    printf("Iloczyn podanych liczb wynosi: %f\n", a*b);

}

float dzielenie(float a, float b) {
    if (b == 0) {
        printf("Nie można dzielić przez 0.");
    } else {
        printf("Iloraz podanych liczb wynosi: %f", a/b);
    }
}

int main() {

    int wybor;
    float a, b;
    float wynik;

    printf("Witamy w kalkulatorze na SOP!\n");
    printf("Proszę podać wartości a i b.\n");
    scanf("%f", &a);
    scanf("%f", &b);
    printf("Proszę wybrać operację.\n 1 - dodawanie\n 2 - odejmowanie\n 3 - mnozenie\n 4 - dzielenie\n");
    scanf("%d", &wybor);
    switch (wybor) {
        case 1:
            dodawanie(a, b);
            break;
        case 2:
            odejmowanie(a, b);
            break;
        case 3:
            mnozenie(a, b);
            break;
        case 4:
            dzielenie(a, b);
            break;
    }

    return 0;
}