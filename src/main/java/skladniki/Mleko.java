package skladniki;


import napoje.*;



public class Mleko<T> extends Skladniki<T> {
	 Napoj napoj;
		
		
		public Mleko(Napoj napoj){
			this.napoj = napoj;
		}
		
	
		public String about() {
			return napoj.about() +" + mleko";
		}

		public float koszt(){
			
			if(napoj instanceof MocnoPalona){
				return (napoj.koszt() + (float)(2.0));
			}
			else if(napoj instanceof Zwykla){
				return (napoj.koszt() + (float)(2.0));
			}
			else if (napoj instanceof Espresso){
				return (napoj.koszt() + (float)(2.0));
			}
			return (float) 0;
		}

	
	public boolean check(T obj) {
		
		return false;
	}

}
