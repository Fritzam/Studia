package Zadanie6;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        /*Napisz program, który pobierze z parametru pin,
          następnie będzie prosił o wpisanie pinu do czasu aż użytkownik wprowadzi pin podany w parametrze programu,
          wtedy wyswietli "Poprawny pin" i zakończy działanie programu.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę wprowadzić 4 cyfrowy pin: ");
        String choice = scanner.nextLine();

        while (choice.length() != 4) {
            System.out.println("Podana wartość musi mieć 4 cyfry. Proszę podać właściwą wartość.");
            choice = scanner.nextLine();
        }
        while(!args[0].equals(choice)) {
            System.out.println("Podana wartość jest niepoprawna. Spróbuj ponownie.");
            choice = scanner.nextLine();
        }
        System.out.println("Kod poprawny. Witamy!");


    }
}
