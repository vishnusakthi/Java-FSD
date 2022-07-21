package PracticeProject1;

public class Method {

public int multipynumbers(int a,int b) {
	int z=a*b;
	return z;
}

public static void main(String[] args) {

	Method b=new Method();
	int ans= b.multipynumbers(5,4);
	System.out.println("Multipilcation is :"+ans);
	}
}
