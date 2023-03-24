package Zadania_01_04_2023;

public class Zadanie16 {
	public static void main(String[] args) {
		int sideLength = Integer.parseInt(args[0]);
		int rowLength = 1;
		for (int i = 0; i < sideLength; i++) {
			for (int j = 0; j < rowLength; j++) {
				System.out.print("*");
			}
			rowLength++;
			System.out.println();
		}
	}
}
