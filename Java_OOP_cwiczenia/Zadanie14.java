package Zadania_01_04_2023;

public class Zadanie14 {
	public static void main(String[] args) {
		int parsedIntWidth = Integer.parseInt(args[1]);
		int parsedIntHeight = Integer.parseInt(args[0]);
		for (int i = 0; i < parsedIntWidth; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 0; i < parsedIntHeight - 2; i++) {
			System.out.print("*");
			for (int j = 0; j < parsedIntWidth - 2; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();

		}
		for (int i = 0; i < parsedIntWidth; i++) {
			System.out.print("*");
		}
	}
}

//10, 6