package observable;

import java.util.ArrayList;
import java.util.List;

import observer.Observer;

public class PostImage implements Observable {
	private List<Observer> observers = new ArrayList<>();

	private String img;

	public String getImg() {
		return this.img;
	}

	public void setImg(String img) {
		this.img = img;
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
		for (Observer o : observers) {
			o.update(m, this);
		}

	}

}
