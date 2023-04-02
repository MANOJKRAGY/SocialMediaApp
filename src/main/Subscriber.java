package main;

import java.util.ArrayList;
import java.util.List;

public class Subscriber {
	
	String username;
	
	Subscriber(String username){
		this.username = username;
	}
       
	private List<Message> subscriberMessage = new ArrayList<Message>();
	
	public List<Message> getSubscriberMessage() {
		 return this.subscriberMessage;
	}
	
	public void setSubscriberMessage(List<Message> subscriberMessage) {
		  
		  this.subscriberMessage = subscriberMessage;
	}
	
	public void addSubscriber(Topic t, ContentServer contentServer) {
		  
		contentServer.addSubscriber(t,this);
	}
	
	public void addMessage(Message m) {
		subscriberMessage.add(m);
        
	}
	
	public void readSubscriberMessage() {
		
		List<Message> list_of_message_subscriber_has = getSubscriberMessage();
		
		for(Message m :list_of_message_subscriber_has ) {
			 System.out.println(username +"read : "+m.getMessage());
		}
	}
	
	
}
