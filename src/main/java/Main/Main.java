package Main;

import napoje.MocnoPalona;
import napoje.Zwykla;
import napoje.Espresso;
import napoje.Napoj;

import skladniki.*;

public class Main {
	public static void main(String[] args) {

		Napoj s1 = new MocnoPalona();
		Napoj s2 = new Espresso();
		Napoj s3 = new Zwykla();

		System.out.println("Bez dodatkow");
		System.out.println(s1.about() + " " + s1.koszt());
		System.out.println(s2.about() + " " + s2.koszt());
		System.out.println(s3.about() + " " + s3.koszt());

		// dodatki

		s1 = new Mleko(s1);
		s2 = new Mleko(s2);
		s3 = new Mleko(s3);
		System.out.println("z mlekiem");
		System.out.println(s1.about() + " " + s1.koszt());
		System.out.println(s2.about() + " " + s2.koszt());
		System.out.println(s3.about() + " " + s3.koszt());

		s1 = new BitaSmietana(s1);
		s2 = new BitaSmietana(s2);
		s3 = new BitaSmietana(s3);
		System.out.println("z bita smietana");
		System.out.println(s1.about() + " " + s1.koszt());
		System.out.println(s2.about() + " " + s2.koszt());
		System.out.println(s3.about() + " " + s3.koszt());

		s1 = new Czekolada(s1);
		s2 = new Czekolada(s2);
		s3 = new Czekolada(s3);
		System.out.println("z czekolada");
		System.out.println(s1.about() + " " + s1.koszt());
		System.out.println(s2.about() + " " + s2.koszt());
		System.out.println(s3.about() + " " + s3.koszt());

	}
}
