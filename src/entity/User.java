package entity;

import java.util.ArrayList;
import java.util.List;

import observer.AbsObserver;
import observer.Observable;
import observer.Observer;

public class User extends AbsObserver implements Observable {
	private String name;
	private String email;

	private List<Observer> observers;
	private List<Article> articles;
	private List<Page> pages;

	public User() {
		this.observers = new ArrayList<>();
		this.articles = new ArrayList<>();
		this.pages = new ArrayList<>();
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
	public void update(Article article, Page page) {
		if (!article.getUser().equals(this)) {
			System.out.println("\n------------------------" + this.getName() + "-------------------------------");
			System.out.println("Notification: new article => " + article.getTitle() + " On page " + page.getName());
			System.out.println("-------------------------------------------------------------------\n");
		}
	}

	@Override
	public void update(Article article, User user) {
		System.out.println("Article :" + article.getTitle() + " from " + user.getName() + ".\n Article content: "
				+ article.getContent());
	}

	/**
	 * @return the observers
	 */
	public List<Observer> getObservers() {
		return observers;
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the articles
	 */
	public List<Article> getArticles() {
		return articles;
	}

	public void addArticle(Article article) {
		this.articles.add(article);
	}

	public void followPage(Page page) {
		this.pages.add(page);
	}

	/**
	 * @param articles the articles to set
	 */
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	/**
	 * @return the pages
	 */
	public List<Page> getPages() {
		return pages;
	}

	public Page getPageByName(String name) throws Exception {
		for (Page page : this.pages) {
			if (page.getName().equalsIgnoreCase(name)) {
				return page;
			}
		}
		throw new Exception("Page non trouvé !");
	}

	public void publishArticleOnPage(Page page, Article article) {
		this.addArticle(article);
		page.update(article, this);
		page.notifyUpdate(article);
	}
}
