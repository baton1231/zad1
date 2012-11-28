package skladniki;

import napoje.Napoj;


public abstract class Skladniki<T> extends Napoj {
	
      public abstract String about();
      public abstract boolean check(T obj);
}
