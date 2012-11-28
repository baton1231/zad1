package skladniki;

import napoje.*;

public class BitaSmietana<T> extends Skladniki<T> {
	Napoj napoj;

	public BitaSmietana(Napoj napoj) {
		this.napoj = napoj;
	}

	public String about() {
		return napoj.about() + " + BitaSmietana";
	}

	public float koszt() {

		return (float) (napoj.koszt() + 3.0);
		
	}

	public boolean check(T obj) {

		return false;
	}

}
