import entity.Article;
import entity.Page;
import entity.User;

public class Main {

	public static void main(String[] args) {
		        
        User alpha = new User();
        alpha.setName("Alpha");
        User bodie = new User();
        bodie.setName("Bodie");
        
        Page pageInfos = new Page(alpha);
        pageInfos.setName("pageInfos");
        
        //follow the page
        pageInfos.attach(alpha);
        
        pageInfos.attach(bodie);
        bodie.followPage(pageInfos);
        
        //follow alpha
        bodie.attach(alpha);
        
        Article infoAlpha = new Article();
        infoAlpha.setUser(alpha);
        infoAlpha.setTitle("ArticleDeAlpha");
        infoAlpha.setContent("Les nouvelles sur la session 3 de COVID plus de vie...");
        
        
        Article infoBodie = new Article();
        infoBodie.setUser(bodie);
        infoBodie.setTitle("ArticleDeBodie");
        infoBodie.setContent("La session x de COVID les humains sont finalement sauvés");
        
        alpha.publishArticleOnPage(pageInfos, infoAlpha);
        bodie.publishArticleOnPage(pageInfos, infoBodie);
        
        bodie.notifyUpdate(infoBodie);
	}

}
