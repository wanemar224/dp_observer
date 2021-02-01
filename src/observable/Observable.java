package observable;

import observer.Observer;

public interface Observable {
	public void attach(Observer o);
    public void detach(Observer o);
    public void notifyUpdate(String m);
}
