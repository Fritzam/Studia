package Zadania_01_04_2023;

public class Zadanie24 {

	public static void main(String[] args) {
		for (int i = 0; i < Integer.parseInt(args[0]); i++) {
			for (int j = 0; j < Integer.parseInt(args[0]); j++) {
				if (j - i < 0) {
					System.out.print(i - j);
				} else {
					System.out.print(j-i);
				}
				System.out.print(' ');
			}
			System.out.println();
		}
	}
}
