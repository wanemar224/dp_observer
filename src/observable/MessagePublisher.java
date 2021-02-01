package observable;

import java.util.ArrayList;
import java.util.List;

import observer.Observer;

public class MessagePublisher implements Observable {

	private List<Observer> observers = new ArrayList<>();
	private String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void attach(Observer o) {
		observers.add(o);
	}

	@Override
	public void detach(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyUpdate(String m) {
		for (Observer o : observers) {
			o.update(m, this);
		}
	}

}
