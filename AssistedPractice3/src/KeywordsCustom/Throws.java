package KeywordsCustom;

public class Throws {
	void Division() throws ArithmeticException
    {
        int a=45,b=0,rs;
rs = a / b;
        System.out.print("\tThe result is : " + rs);
    }
     public static void main(String[] args)
    {
Throws T = new Throws();
         try
        {
            T.Division();
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\tError : " + Ex.getMessage());
        }
        System.out.print("\n\tEnd of program.");
    }
}
