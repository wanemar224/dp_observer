package observer;

import entity.Article;
import entity.Page;
import entity.User;


public interface Observer {
	 public void update(Article article, Observable ob);
	 public void update(Article article, Page page);
	 public void update(Article article, User user);
}
