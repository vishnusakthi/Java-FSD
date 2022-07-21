package Multithreading;

public class ThreadRunnable implements Runnable {

	public  void run() {
		
		for(int i=1; i<5; i++) {
			
			System.out.println(i+ " "+Thread.currentThread().getName());
		
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
	
		ThreadRunnable instance1= new ThreadRunnable();
		ThreadRunnable instance2= new ThreadRunnable();
		
		
		Thread t1=new  Thread(instance1);
		Thread t2=new  Thread(instance2);
		
		t1.setName("First");
		t2.setName("Second");
	
		t1.start();
		t2.start();
	}
}
