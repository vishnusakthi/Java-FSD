package PracticeProject2;

public class Constructor {
	int employeeId;
	String employeeName;
	String department;
	float salary;
	
	public Constructor() {
		employeeId=1;
		employeeName="Employee001";
		department="Developer";
		salary=50000;
	}
	
	public Constructor(int employeeId,String employeeName,String department,float salary) {
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.department=department;
		this.salary=salary;
	}
	
	public void display() {
		System.out.println("Id:"+employeeId);
		System.out.println("Name:"+employeeName);
		System.out.println("Department:"+department);
		System.out.println("Salary:"+salary);
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Constructor e= new Constructor();
		Constructor e1= new Constructor(2, "Vishnu", "Training", 30000); 

        e.display();
		
		e1.display();
		
	}
}
