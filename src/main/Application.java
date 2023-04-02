package main;



public class Application {

	public static void main(String[] args) {
		Subscriber subscriber = new Subscriber("Manoj");
		ContentServer contentserver = new ContentServer();
		Topic topic = new Topic();
		topic.setTopic("Topic_MANOJ");
		subscriber.addSubscriber(topic, contentserver);
		
		Publisher p = new Publisher(topic);
		
		//System.out.println(subscriber.getSubscriberMessage());
		Message message1 = new Message();
		message1.setMessage("How are  you");

		Message message2 = new Message();
		message2.setMessage("How do u do"); 
		
	    p.publish(message1, contentserver);
	    p.publish(message2, contentserver);
	    
	    
	    /* second user */
	    
		Subscriber subscriber1 = new Subscriber("aayush");
		//ContentServer contentserver1 = new ContentServer();
		Topic topic1 = new Topic();
		topic1.setTopic("Topic_MANOJ");
		
		subscriber1.addSubscriber(topic, contentserver);
		
		Publisher p1 = new Publisher(topic1);
		
		//System.out.println(subscriber.getSubscriberMessage());
		Message message11 = new Message();
		message11.setMessage("How are  you 2222");

		Message message21 = new Message();
		message21.setMessage("How do u do  2222"); 
		
	    p.publish(message11, contentserver);
	    p.publish(message21, contentserver);
	    
	    
	    subscriber.readSubscriberMessage();
	    subscriber1.readSubscriberMessage();
        
    }

}
