package observable;

import java.util.ArrayList;
import java.util.List;

import observer.AbsObserver;
import observer.Observer;

public class User extends AbsObserver implements Observable {
	private List<Observer> observers = new ArrayList<>();
	
	private String pseudo;
	
	/**
	 * @return the pseudo
	 */
	public String getPseudo() {
		return pseudo;
	}

	/**
	 * @param pseudo the pseudo to set
	 */
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	@Override
	public void attach(Observer o) {
		this.observers.add(o);
	}

	@Override
	public void detach(Observer o) {
		this.observers.remove(o);
	}

	@Override
	public void notifyUpdate(String m) {
		for(Observer o: observers) {
			o.update(m, this);
		}
	}
	
	@Override
	public void update(String m, User user) {
		System.out.println("Your are notification -- "+ m +" -- from user "+ user.getPseudo());
	}

}
