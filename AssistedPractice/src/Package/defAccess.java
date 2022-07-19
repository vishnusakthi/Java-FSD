package Package;
class defaultModifier
{
	//default
	void message()
	{
		System.out.println("This is default access specifier");
	}
}

public class defAccess {
	public static void main(String[] args) {
		System.out.println("Default Access Specifiers");
		defaultModifier obj = new defaultModifier();
		obj.message();
		
	}
}
