package main;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContentServer {
	
	private Map<Topic ,List<Subscriber>>  subscriberList = new HashMap<Topic,List<Subscriber>>();

	public void addSubscriber(Topic t , Subscriber subscriber ) {
		 
		if(subscriberList.containsKey(t)) {
			subscriberList.get(t).add(subscriber);
		}else {
			 List<Subscriber> list = new ArrayList<Subscriber>();
			 list.add(subscriber);
			 subscriberList.putIfAbsent(t,  list);
		}

		 //subscriberList.get(t).add(subscriber);
	} 

	public void sendMessage(Topic t ,Message m) {
		
		List<Subscriber> subscriber = subscriberList.get(t);
		for(Subscriber s : subscriber ) {
			 s.addMessage(m);
		}
	}
}
