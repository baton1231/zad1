package skladniki;

import napoje.*;

public class Czekolada<T> extends Skladniki<T> {
	Napoj napoj;

	public Czekolada(Napoj napoj) {
		this.napoj = napoj;
	}

	public String about() {
		return napoj.about() + " + Czekolada";
	}

	public float koszt() {

		return (float) (napoj.koszt() + 2.5);
	}

	public boolean check(T obj) {

		return false;
	}

}
