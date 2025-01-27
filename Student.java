package School;

public class Student {
	int id;
	String name;
	long rollno;
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
	public long getRollno() {
		return rollno;
	}
	public void setRollno(long rollno) {
		this.rollno = rollno;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public Student(int id, String name, long rollno, long mobileno) {
		super();
		this.id = id;
		this.name = name;
		this.rollno = rollno;
		this.mobileno = mobileno;
	}
	public Student() {
		
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollno=" + rollno + ", mobileno=" + mobileno + "]";
	}
	

}
