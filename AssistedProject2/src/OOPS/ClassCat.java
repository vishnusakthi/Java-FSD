package OOPS;

public class ClassCat {

	String name; 
    int age; 
    String color; 
    public ClassCat(String name, int age, String color) 
    { 
        this.name = name; 
        this.age = age; 
        this.color = color; 
    } 
    public String getName() 
    { 
        return name; 
    } 
    public int getAge() 
    { 
        return age; 
    } 
    public String getColor() 
    { 
        return color; 
    } 
    @Override
    public String toString() 
    { 
        return("Hi my name is "+ this.getName()+ ".\nMy age and colour are " + " " + this.getAge()+ " and " + this.getColor() + "."); 
    } 
    public static void main(String[] args) 
    { 
         ClassCat ClassCat = new ClassCat("Chikku", 3, "black"); 
         System.out.println(ClassCat.toString()); 
    }

}
