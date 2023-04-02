package main;

public class Publisher {
     Topic t;
     
     Publisher(Topic t){
    	 this.t = t;
     }
     
     public void publish(Message m , ContentServer contentserver) {
    	 contentserver.sendMessage(t, m);
     }
}
