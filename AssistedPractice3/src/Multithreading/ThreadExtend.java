package Multithreading;

public class ThreadExtend extends Thread{
	
	public void run() {
		System.out.println("Concurrent Thread Started running");
	}
	
	public static void main(String[] args) {
		
		ThreadExtend t1= new ThreadExtend();
		ThreadExtend t2= new ThreadExtend();
		
		t1.start();
		t2.start();
	}

}
