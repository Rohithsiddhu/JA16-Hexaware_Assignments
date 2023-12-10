package Set;

import java.util.Objects;

public class Employee {
	private int eid;
	private String name;
	private double salary;
public Employee(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
@Override
public String toString() {
	return this.eid+"";
}
@Override
public int hashCode() {
	return Objects.hash(eid);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return eid == other.eid;
}

}
