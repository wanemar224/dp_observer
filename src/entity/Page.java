package entity;

import java.util.ArrayList;
import java.util.List;

import observer.AbsObserver;
import observer.Observable;
import observer.Observer;

public class Page extends AbsObserver implements Observable {
	private String name;
	private User admin;
	private List<Observer> observers;

	public Page(User admin) {
		this.admin = admin;
		this.admin.followPage(this);
		this.observers = new ArrayList<>();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the users
	 */
	public User getAdmin() {
		return this.admin;
	}

	/**
	 * @return the observers
	 */
	public List<Observer> getObservers() {
		return observers;
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
	public void notifyUpdate(Article article) {
		for (Observer observer : this.observers) {
			observer.update(article, this);
		}
	}

	@Override
	public void update(Article article, User user) {
		System.out.println("PAGE ("+this.getName()+"):\nNew article : " + article.getTitle() +" ( user: "+user.getName()+")\nArticle content: "+article.getContent()+"\n");
	}
}
