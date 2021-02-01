package observer;

import observable.MessagePublisher;
import observable.PostImage;

public class MessageSubscriberTwo extends AbsObserver {
	@Override
	public void update(String m, PostImage post) {
		System.out.println("Post from "+post.getImg()+" "+m );	
	}
	
	@Override
	public void update(String m, MessagePublisher msgPub) {
			System.out.println("Msg from "+msgPub.getName()+" "+m);
	}
	
}
