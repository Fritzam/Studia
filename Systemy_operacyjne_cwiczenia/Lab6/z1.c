#include <signal.h>
#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <unistd.h>

void signalSzyderstwo() {
    printf("Nie powstrzymasz mnie!\n");
}

void signalStop() {
    printf("Proces %d zostaje natychmiast zlikwidowany.\n", getpid());
    exit(EXIT_SUCCESS);
}


int main(int argc, char **argv) {

    /*
    README!
    Proszę odkomentować kod jeżeli chce Pan wykorzystać z1.c jako standalone. Żeby wysłać do niego sygnał poprzez exec z innego programu
    wszystko co odnosi się do poboru wartości z parametrów programu musi być w komentarzach.
    */

    // printf("Program przyjmuje do 3 argumentów.\n");
    // printf("Pierwszy odpowiada za rodzaj odpowiedzi w następujący sposób:\n");
    // printf("1 - Odpowiedź domyślna.\n2 - Ignorowanie.\n3 - Odpowiedź użytkownika.\n\n");
    // printf("Drugi argument to sygnał. Np. 2 dla SIGINT.\n\n");
    // printf("Trzeci(opcjonalnie, przy wyborze wlasnym w parametrze 1) to opcja własna. Dodam dwie, 1 - szyderstwo i 2 - stop.\n");

    // if (argc != 3 && argc != 4) {
    //     printf("\n\nNiewłaściwa ilość argumentów. Oczekiwana wartość to 3 lub 4, jeżeli argumentem 1 jest opcja własna. Podana ilość to: %d\n\n", argc - 1);
    //     exit(EXIT_FAILURE);
    // }

    // switch (atoi(argv[1])) {
    //     case 1:
    //         signal(atoi(argv[2]), SIG_DFL);
    //         break;
    //     case 2:
    //         signal(atoi(argv[2]), SIG_IGN);
    //         break;
    //     case 3:
    //         if (atoi(argv[3]) == 1) {
    //             signal(atoi(argv[2]), signalSzyderstwo);
    //             break;
    //         } else if (atoi(argv[3]) == 2) {
    //             signal(atoi(argv[2]), signalStop);
    //             break;
    //         }
    // }

    /*Jeżeli nie chce Pan sprawdzać z1exec(czyli wysylac sygnal przy pomocy innego programu, fork() i exec*() to proszę wykomentować poniższą linijkę
    (tą z signalem) i odkomentować linijki ponad tym komentarzem. */
    signal(SIGINT, signalSzyderstwo);
    while(1) {
        printf("I am wasting your cycles! :) Process ID: %d.\n", getpid());
        sleep(3);
        // printf("Zakończenie sabotażysty przy pomocy killa w programie: \n");
        // kill(getpid(), 9);

    }

    return 0;
}