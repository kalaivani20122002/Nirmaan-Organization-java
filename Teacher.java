package School;

public class Teacher {
	int id;
	String name;
	double salary;
	long mobileno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public Teacher(int id, String name, double salary, long mobileno) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.mobileno = mobileno;
	}
	public Teacher() {
		
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", salary=" + salary + ", mobileno=" + mobileno + "]";
	}
	

}
