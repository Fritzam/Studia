package Zadania_01_04_2023;

public class Zadanie10 {
	public static void main(String[] args) {
		
		for (int i = 0; i < args.length; i++) {
			if (args[i].length() > 3 && args[i + 1].length() > 3 && args[i + 2].length() > 3) {
				System.out.println(i);
				break;
			}
		}
		
		
	}
}
