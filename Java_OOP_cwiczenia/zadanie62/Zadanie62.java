package zadanie62;

class Czas {
	int godziny;
	int minuty;
}

public class Zadanie62 {

// TODO uzupełnij kod w tym miejscu! rozwiązaniem jest tylko brakujący kod!

	public static Czas roznica(Czas t1, Czas t2) {

		int pierwszy_czas_w_minutach = t1.godziny * 60 + t1.minuty;
		int drugi_czas_w_minutach = t2.godziny * 60 + t2.minuty;
		int roznica;
		Czas result = new Czas();

		if (pierwszy_czas_w_minutach > drugi_czas_w_minutach) {
			roznica = pierwszy_czas_w_minutach - drugi_czas_w_minutach;
			result.godziny = roznica / 60;
			result.minuty = roznica % 60;
		} else {
			roznica = drugi_czas_w_minutach - pierwszy_czas_w_minutach;
			result.godziny = roznica / 60;
			result.minuty = roznica % 60;
		}

		return result;

	}

	public static void main(String[] args) {
		if (args.length != 4) {
			System.out.println("Jako argumenty podaj cztery liczby");
			return;
		}

		Czas t1 = new Czas();
		t1.godziny = Integer.parseInt(args[0]);
		t1.minuty = Integer.parseInt(args[1]);

		Czas t2 = new Czas();
		t2.godziny = Integer.parseInt(args[2]);
		t2.minuty = Integer.parseInt(args[3]);

		Czas difference = roznica(t1, t2);

		System.out.println("Różnica między");
		System.out.println(t1.godziny + ":" + t1.minuty);
		System.out.println("a");
		System.out.println(t2.godziny + ":" + t2.minuty);
		System.out.println("to");
		System.out.println(difference.godziny + ":" + difference.minuty);
	}
}