#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>
#include <signal.h>
#include <stdlib.h>

int main(int argc, char** argv) {

    printf("Proszę podać jakikolwiek argument do z1exec dla grupy procesów. Brak argumentów uruchomi jedno dziecko.\n");
    if (argc == 1) {
        printf("Program wykona program z1exec.c dla jednego dziecka.\n");
        pid_t pid = fork();
        if (pid == 0) {
            execl("./z1", "z1", NULL);

        } else {
            //Poczekaj aż uruchomi się program w dziecku.
            sleep(3);

            //Wyslij sygnal sigint do programu w dziecku. Proszę pamiętać o wykomentowaniu signalu linijkę nad pętlą w z1.c.
            //Wysyła 5x SIGINT(Na ktory z1 odpowie szyderstwem) i zakonczy dziecko.
            for (int i = 0; i < 5; i++) {
                kill(pid, SIGINT);
                sleep(1);
            }
            printf("\nPrzerywam działanie programu.\n");
            kill(pid, SIGTERM);
        }
    } else if (argc == 2) {

        printf("Program wyśle sygnał do grupy procesów.\n");
        pid_t pid = fork();
        pid_t pid2 = fork();
        if (pid == 0) {
            execl("./z1", "z1", NULL);
        }

        if (pid2 == 0) {
            execl("./z1", "z1", NULL);
        }
        else {
            
            sleep(3);
            for (int i = 0; i < 2; i++) {
                kill(pid, SIGINT);
                kill(pid2, SIGINT);
                sleep(2);
            }
            for (int i = 1; i <= 5; i++) {
                printf("Umrę za: %d\n", 6 - i);
                sleep(1);
            }
            printf("Zgładziłeś mnie.\n");
            kill(0, SIGTERM);

        }


    } else {
        printf("Niewłaściwa ilość parametrów, podano: %d. Oczekiwana wartość to brak, lub 1.", argc - 1);
        exit(EXIT_FAILURE);
    }
        
}