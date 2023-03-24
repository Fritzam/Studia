package Zadania_01_04_2023;

public class Zadanie19 {
		static void upper_half(int number) {
			System.out.print("*");
			for (int j = 0; j < number - 2; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
			
			System.out.print(" ");
			for (int j = 0; j < number - 2; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
			
			System.out.print(" ");
			for (int j = 0; j < number - 2; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
			
			System.out.print("*");
			for (int j = 0; j < number - 2; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
			
		}
		
		
		public static void main(String[] args) {
			int number = Integer.parseInt(args[0]);
			upper_half(number);
		}
			
}
