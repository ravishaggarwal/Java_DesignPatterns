package mytest.myexample.designpattern.observerPattern;

import java.util.ArrayList;
import java.util.List;


public class JorunalismGoAhead implements Subject {

	private List<Observer> observersList_GeoPressLocated;
	private String message_fromHOD_Journalism;
	private boolean statusChanged_afterMessagePost;
	private final Object MUTEX= new Object();
	
	public JorunalismGoAhead(){
		this.observersList_GeoPressLocated=new ArrayList();
	}
	
	@Override
	public void register(Observer obj) {
		if(obj == null) throw new NullPointerException("Null Observer");
		synchronized (MUTEX) {
		if(!observersList_GeoPressLocated.contains(obj)) observersList_GeoPressLocated.add(obj);
		}
	}

	@Override
	public void unregister(Observer obj) {
		synchronized (MUTEX) {
		observersList_GeoPressLocated.remove(obj);
		}
	}

	@Override
	public void notifyObservers() {
		List<Observer> observersLocal = null;
		synchronized (MUTEX) {
			if (!statusChanged_afterMessagePost)
				return;
			observersLocal = new ArrayList(this.observersList_GeoPressLocated);
			this.statusChanged_afterMessagePost=false;
		}
		for (Observer obj : observersLocal) {
			obj.update();
			
		}

	}

	@Override
	public Object getUpdate(Observer obj) {
		return this.message_fromHOD_Journalism;
	}
	
	//method to post message to the topic
	public void postMessage(String msg){
		System.out.println("Message Posted to Topic:"+msg);
		this.message_fromHOD_Journalism=msg;
		this.statusChanged_afterMessagePost=true;
		notifyObservers();
	}

	
}
