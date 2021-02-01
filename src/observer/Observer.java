package observer;

import observable.MessagePublisher;
import observable.Observable;
import observable.PostImage;
import observable.User;

public interface Observer {
	 public void update(String m, Observable ob);
	 public void update(String m, MessagePublisher msgPub);
	 public void update(String m, PostImage post);
	 public void update(String m, User user);
}
