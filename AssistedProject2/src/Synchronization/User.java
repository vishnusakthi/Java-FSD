package Synchronization;

public class User extends Thread {


	String name;
	String msg;
	Sender sender;
	
	public User(String name,String msg, Sender sender) {
		this.name=name;
		this.msg=msg;
		this.sender=sender;
	}
	
	public void run() {
		System.out.println(name +  "wants to send message : "+msg);
		
		synchronized(sender) {
	    	sender.send(msg);
	    }
	}
}
