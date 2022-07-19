package Package;
class privateAccess
{
	private void message()
	{
		System.out.println("This is private access modifier");
	}
}
public class privateModifier {
	public static void main(String[] args) {
		System.out.println("Private Access Specifier");
		privateAccess o=new privateAccess();
		
	}

}
