package Zadania_01_04_2023;

public class Zadanie30 {

	static boolean palindromeChecker(String palindrome) {

		for (int i = 0; i < palindrome.length(); i++) {
			if (palindrome.charAt(0 + i) != palindrome.charAt(palindrome.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		System.out.println(palindromeChecker(args[0]));

	}
}
