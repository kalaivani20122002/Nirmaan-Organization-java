package Day13;

class EmployeeDetails{
	private String name;
	private int id;
	private long mobileno;
	private double salary;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public String toString() {
		return "Employee name : "+name+"\nEmployee Id :" + id + "\nEmployee Mobile Number : "+mobileno+"\nEmployee Salary :  "+salary;
	}
}

public class EmployeeGetSet {
	public static void main(String[] args) {
		EmployeeDetails ed1 = new EmployeeDetails();
		ed1.setName("Dustin Henderson");
		System.out.println(ed1.getName());
		ed1.setId(1377);
		System.out.println(ed1.getId());
		ed1.setMobileno(9840236379l);
		System.out.println(ed1.getMobileno());
		ed1.setSalary(90000);
		System.out.println(ed1.getSalary());
		
		EmployeeDetails ed2 = new EmployeeDetails();
		ed2.setName("Michael Wheeler");
		System.out.println(ed2.getName());
		ed2.setId(1378);
		System.out.println(ed2.getId());
		ed2.setMobileno(9840236379l);
		System.out.println(ed2.getMobileno());
		ed2.setSalary(85000);
		System.out.println(ed2.getSalary());
		
		EmployeeDetails ed3 = new EmployeeDetails();
		ed3.setName("William Buyers");
		System.out.println(ed3.getName());
		ed3.setId(1379);
		System.out.println(ed3.getId());
		ed3.setMobileno(9840236379l);
		System.out.println(ed3.getMobileno());
		ed3.setSalary(95000);
		System.out.println(ed3.getSalary());
		
		EmployeeDetails ed4 = new EmployeeDetails();
		ed4.setName("Lucas Sinclair");
		System.out.println(ed4.getName());
		ed4.setId(1380);
		System.out.println(ed4.getId());
		ed4.setMobileno(9840236379l);
		System.out.println(ed4.getMobileno());
		ed4.setSalary(80000);
		System.out.println(ed4.getSalary());
		
		System.out.println(ed1);
		System.out.println(ed2);
		System.out.println(ed3);
		System.out.println(ed4);
	}

}
