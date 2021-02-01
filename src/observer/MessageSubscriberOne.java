package observer;

import observable.MessagePublisher;

public class MessageSubscriberOne extends AbsObserver {

	@Override
	public void update(String m, MessagePublisher msgPub) {
		System.out.println("Msg from " + msgPub.getName() + " " + m);
	}
}
