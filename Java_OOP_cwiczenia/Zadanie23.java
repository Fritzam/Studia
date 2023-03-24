package Zadania_01_04_2023;

public class Zadanie23 {
	public static void main(String[] args) {
			for (int i = 1; i <= 4; i++) {
				for (int j = 1; j <= 4; j++) {
					if (j == i) {
						continue;
					}
					for (int k = 1; k <= 4; k++) {
						if (k == i || k == j) {
							continue;
						}
						for (int l = 1; l <= 4; l++) {
							if (l == i || l == j || l == k) {
								continue;
							}
							System.out.print(i);
							System.out.print(j);
							System.out.print(k);
							System.out.print(l);
							System.out.println();
						}
					}
				}
			}
		
		
	}

}