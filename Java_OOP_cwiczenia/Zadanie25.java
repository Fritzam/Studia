package Zadania_01_04_2023;

public class Zadanie25 {
	public static void main(String[] args) {
		int height = Integer.parseInt(args[0]);
		for (int i = 1; i <= height; i++) {
			for (int j = 0; j < height - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k);
			}
			System.out.println();
		}

	}
}
