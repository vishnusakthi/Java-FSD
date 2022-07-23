package Synchronization;

public class TestSync {
public static void main(String[] args) {
		
		Sender sender = new  Sender();
		
		User t1= new User("Hi", "Hello Good morning..", sender);
		User t2= new User("Hello","Hi how  are you?",sender);
		
		t1.start();
		t2.start();
	}

}
