package KeywordsCustom;

public class Finally {
	public static void main(String[] args)
    {
        int a=45,b=0,rs=0;
        try
        {
            rs = a / b;
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\tError : " + Ex.getMessage());
        }
        finally
        {
            System.out.print("\n\tThe result is : " + rs);
        }
    }

}
