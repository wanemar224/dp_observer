package observer;

import entity.Article;
import entity.Page;
import entity.User;

public abstract class AbsObserver implements Observer{
	@Override
	public void update(Article article, Observable ob)
	{
		System.out.println("New article: "+ article.getTitle());
	}

	@Override
	public void update(Article article, Page page) {
		// TODO Auto-generated method stub	
	}
	
	@Override
	public void update(Article article, User user) {
		// TODO Auto-generated method stub	
	}
}
