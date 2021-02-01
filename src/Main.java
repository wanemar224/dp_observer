import observable.User;

public class Main {

	public static void main(String[] args) {
//		MessageSubscriberOne s1 = new MessageSubscriberOne();
//        MessageSubscriberTwo s2 = new MessageSubscriberTwo();
//        MessageSubscriberThree s3 = new MessageSubscriberThree();
//        
//        MessagePublisher p = new MessagePublisher();
//        p.setName("Marwane");
//        PostImage img = new PostImage();
//        img.setImg("Studio S");
        
        User alpha = new User();
        alpha.setPseudo("Alpha");
        User bodie = new User();
        bodie.setPseudo("Bodie");
        
        alpha.attach(bodie);
        bodie.attach(alpha);
        
        alpha.notifyUpdate("Je suis à Metz");
        bodie.notifyUpdate("En route mec");
        
        //p.attach(s1);
        //p.attach(s2);
    
        //img.attach(s2);
        
        //p.notifyUpdate("First Message");   //s1 and s2 will receive the update
        //img.notifyUpdate("image postée");
        
        //p.detach(s1);
        //p.attach(s3);
         
        //p.notifyUpdate("Second Message"); //s2 and s3 will receive the update
	}

}
