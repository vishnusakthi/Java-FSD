package Package;

public class publicModifier {
	public static void main(String[] args) {
		System.out.println("This is public access modifier");
		protectedModifier obj=new protectedModifier();
		obj.message();
	}

}
