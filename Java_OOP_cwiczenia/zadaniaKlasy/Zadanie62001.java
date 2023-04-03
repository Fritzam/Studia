package zadaniaKlasy;

class Prostokat62001 {
	public float dlugosc;
	public float szerokosc;

	public float polePowierzchni() {
		return dlugosc * szerokosc;
	}
}

public class Zadanie62001 {
	public static void main(String[] args) {

// TODO uzupełnij kod w tym miejscu! rozwiązaniem jest tylko brakujący kod!
		float dlugosc = Float.parseFloat(args[1]);
		float szerokosc = Float.parseFloat(args[0]);
		Prostokat62001 prostokat = new Prostokat62001();
		prostokat.dlugosc = dlugosc;
		prostokat.szerokosc = szerokosc;

		System.out.println("Pole powierzchni prostokąta o długości " + dlugosc + " i szerokości " + szerokosc
				+ " wynosi " + prostokat.polePowierzchni() + ".");
	}
}