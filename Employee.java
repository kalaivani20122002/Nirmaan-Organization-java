package Day8;

public class Employee {
	String EmpName;
	int EmpId;
	long MobileNo;
	double Salary;
	
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.EmpName = "kalai";
		emp1.EmpId = 001;
		emp1.MobileNo = 9697573867l;
		emp1.Salary = 80000;
		
		System.out.println("Employee name: "+emp1.EmpName+"\nEmployee Id: "+ emp1.EmpId+"\nMobile No: "+emp1.MobileNo+"\nSalary: "+emp1.Salary);
		
		
		Employee emp2 = new Employee();
		emp2.EmpName = "Krishna";
		emp2.EmpId = 002;
		emp2.MobileNo = 9697558394l;
		emp2.Salary = 70000;
		
		System.out.println("Employee name: "+emp2.EmpName+"\nEmployee Id: "+ emp2.EmpId+"\nMobile No: "+emp2.MobileNo+"\nSalary: "+emp2.Salary);
		
		
		Employee emp3 = new Employee();
		emp3.EmpName = "Vecna";
		emp3.EmpId = 003;
		emp3.MobileNo = 9697558394l;
		emp3.Salary = 60000;
		
		System.out.println("Employee name: "+emp3.EmpName+"\nEmployee Id: "+ emp3.EmpId+"\nMobile No: "+emp3.MobileNo+"\nSalary: "+emp3.Salary);
		
				
		Employee emp4 = new Employee();
		emp4.EmpName = "Eleven";
		emp4.EmpId = 004;
		emp4.MobileNo = 9697558394l;
		emp4.Salary = 60000;
		
		System.out.println("Employee name: "+emp4.EmpName+"\nEmployee Id: "+ emp4.EmpId+"\nMobile No: "+emp4.MobileNo+"\nSalary: "+emp4.Salary);
		
		
		Employee emp5 = new Employee();
		emp5.EmpName = "Steve Harington";
		emp5.EmpId = 002;
		emp5.MobileNo = 9697558394l;
		emp5.Salary = 70000;
		
		System.out.println("Employee name: "+emp5.EmpName+"\nEmployee Id: "+ emp5.EmpId+"\nMobile No: "+emp5.MobileNo+"\nSalary: "+emp5.Salary);
		
	}

}
