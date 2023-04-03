package zadaniaKlasy;

class Prostokat62003 {
	private float dlugosc;
	private float szerokosc;

	public Prostokat62003(float dlugosc, float szerokosc) {
		this.dlugosc = dlugosc;
		this.szerokosc = szerokosc;
	}

	public float polePowierzchni() {
		return dlugosc * szerokosc;
	}
}

public class Zadanie62003 {
	public static void main(String[] args) {

		float szerokosc = Float.parseFloat(args[0]);
		float dlugosc = Float.parseFloat(args[1]);
		Prostokat62003 prostokat = new Prostokat62003(szerokosc, dlugosc);

// TODO uzupełnij kod w tym miejscu! rozwiązaniem jest tylko brakujący kod!

		System.out.println("Pole powierzchni prostokąta o długości " + dlugosc + " i szerokości " + szerokosc
				+ " wynosi " + prostokat.polePowierzchni() + ".");
	}
}