package Zadania_01_04_2023;

public class Zadanie31 {
	

	public static void main(String[] args) {
		int counter = args[0].length();
		char[] snake = args[0].toCharArray();
		String camel = "";
		
		for (int i = 0; i < counter; i++) {
			if (snake[i] == '_') {
				camel += Character.toUpperCase(snake[i+1]);
				i+= 2;
			}
			camel += snake[i];
		}
		
		System.out.println(camel);
		
	}
}
