package Zadanie30;

class Main {

    static boolean checkPalindrome(String palindrome) {
        for (int i = 0; i < palindrome.length(); i++) {
            if (i == palindrome.length()/2) {
                break;
            }
            if(palindrome.charAt(i) != palindrome.charAt(palindrome.length()-1-i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        /*(string) Sprawdź czy słowo zawarte w parametrze jest palindromem – wydrukuj "true" jeśli jest lub "false" jeśli nie jest
                   użyj klasy String*/

        System.out.println(checkPalindrome(args[0]));

    }

}
