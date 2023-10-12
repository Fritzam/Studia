#include <signal.h>
#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <unistd.h>


void odebranieSygnalu() {
    printf("Otrzymalem SIGUSR2 od innego procesu.\n");
}

int main() {

    int wartosc = 0;

    printf("Moje PID: %d\n", getpid());
    printf("Moje PPID: %d\n", getppid());
    printf("Moje RID: %d\n", getuid());
    printf("Moje EUID: %d\n", geteuid());
    printf("Moje GID: %d\n", getgid());
    printf("Moje EGID: %d\n", getegid());

    pid_t pid = fork();
    if(pid == 0) {
        printf("Jestem procesem potomnym.\n");
        printf("Mój PID to: %d\n", getpid());
        printf("PID mojego rodzica to: %d\n\n\n", getppid());
        kill(getppid(), SIGUSR2);
        sleep(5);
    } else {
        //wait for kid
        sleep(5);
        printf("Jestem procesem macierzystym.\n");
        printf("Moje pid to: %d\n", getpid());
        printf("PID mojego potomka to: %d\n", pid);
        if (signal(SIGUSR2, odebranieSygnalu) == SIG_ERR){
                perror("Funkcja signal ma problem z SIGUSR1");
                exit(EXIT_FAILURE);
        }
        sleep(15);
        printf("Naciśnij 1, żeby kontynuować.");
        scanf("%d", &wartosc);
        }


    return 0;
}