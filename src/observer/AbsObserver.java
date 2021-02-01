package observer;

import observable.MessagePublisher;
import observable.Observable;
import observable.PostImage;
import observable.User;

public abstract class AbsObserver implements Observer{
	@Override
	public void update(String m, Observable ob)
	{
		System.out.println("From "+ ob.getClass() + " "+m);
	}
	
	@Override
	public void update(String m, MessagePublisher msgPub) {
		// TODO Auto-generated method stub
	}

	@Override
	public void update(String m, PostImage post) {
		// TODO Auto-generated method stub	
	}
	@Override
	public void update(String m, User user) {
		// TODO Auto-generated method stub	
	}
}
