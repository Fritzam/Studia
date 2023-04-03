package zadaniaKlasy;

class Prostokat62002 {
	private float dlugosc;
	private float szerokosc;

	public void setDlugosc(float dlugosc) {
		this.dlugosc = dlugosc;
	}

	public void setSzerokosc(float szerokosc) {
		this.szerokosc = szerokosc;
	}

	public float polePowierzchni() {
		return dlugosc * szerokosc;
	}
}

public class Zadanie62002 {
	public static void main(String[] args) {

		float dlugosc = Float.parseFloat(args[0]);
		float szerokosc = Float.parseFloat(args[1]);
		Prostokat62002 prostokat = new Prostokat62002();
		prostokat.setSzerokosc(szerokosc);
		prostokat.setDlugosc(dlugosc);

// TODO uzupełnij kod w tym miejscu! rozwiązaniem jest tylko brakujący kod!

		System.out.println("Pole powierzchni prostokąta o długości " + dlugosc + " i szerokości " + szerokosc
				+ " wynosi " + prostokat.polePowierzchni() + ".");
	}
}