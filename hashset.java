package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.TreeSet;

public class hashset implements Comparable<hashset> {
	int id;
	String name;

	@Override
	public int hashCode() {
		return Objects.hashCode(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.id==((hashset)obj).id)return true;
		return false;
	}

	public hashset(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

	public static void main(String[] args) {
		HashSet<hashset> hs=new HashSet<hashset>();
		hashset emp1=new hashset(1,"kalai");
		hs.add(emp1);
		hashset emp2=new hashset(2,"kalai");
		hs.add(emp2);
		hashset emp3=new hashset(1,"kalai");
		hs.add(emp3);
		hashset emp4=new hashset(5,"kalai");
		hs.add(emp4);
		hashset emp5=new hashset(6,"kalai");
		hs.add(emp5);
		hashset emp6=new hashset(7,"kalai");
		hs.add(emp6);
		hashset emp7=new hashset(8,"kalai");
		hs.add(emp7);
		hashset emp8=new hashset(10,"kalai");
		hs.add(emp8);
		hashset emp9=new hashset(11,"kalai");
		hs.add(emp9);
		hashset emp10=new hashset(12,"kalai");
		hs.add(emp10);
		System.out.println(emp1.equals(emp2));
		System.out.println(hs);
		
		LinkedHashSet<hashset> lhs=new LinkedHashSet<hashset>();
		hashset lhs1=new hashset(5,"kalai");
		lhs.add(lhs1);
		hashset lhs2=new hashset(2,"kalai");
		lhs.add(lhs2);
		hashset lhs3=new hashset(3,"kalai");
		lhs.add(lhs3);
		hashset lhs4=new hashset(2,"kalai");
		lhs.add(lhs4);
		System.out.println(lhs);
		
		
		TreeSet<hashset> ts=new TreeSet<hashset>();
		hashset ts1=new hashset(5,"kalai");
		ts.add(ts1);
		hashset ts2=new hashset(2,"kalai");
		ts.add(ts2);
		hashset ts3=new hashset(3,"kalai");
		ts.add(ts3);
		hashset ts4=new hashset(2,"kalai");
		ts.add(ts4);
		System.out.println(ts);
		
		String name="Java";
		int n1=(name.charAt(0)*31*31*31)+(name.charAt(1)*31*31)+(name.charAt(2)*31)+(name.charAt(3));
		System.out.println(n1);
		System.out.println(name.hashCode());
	}

	@Override
	public String toString() {
		return "hashset [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(hashset o) {
		if(this.id<o.id) {
			return -1;
		}else if(this.id>o.id) {
			return 1;
		}
		
		return 0;
		
	}
}

