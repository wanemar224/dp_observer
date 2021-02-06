package observer;

import entity.Article;

public interface Observable {
	public void attach(Observer o);
    public void detach(Observer o);
    public void notifyUpdate(Article article);
}
