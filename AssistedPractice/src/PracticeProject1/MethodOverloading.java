package PracticeProject1;

public class MethodOverloading {
	int add(int a, int b) {
		return a+b;
	}
	int add(int a, int b,int c) {
		return a+b+c;
	}
	float add(float a, float b) {
		return a+b;
	}
	
	double add(double a, double b) {
		return a+b;
	}
	
	 public static void main(String[] args) {
		MethodOverloading obj= new MethodOverloading();
		System.out.println("Addition of 20 and 4 :"+obj.add(20, 4));
		System.out.println("Addition of 12.0 and 6.56 :"+obj.add(12.0f,6.56f));
		System.out.println("Addition of 2 double :"+obj.add(2.3, 6.7));
		System.out.println("Addition of 3 int: "+obj.add(4, 6, 9));
		
	}

}
