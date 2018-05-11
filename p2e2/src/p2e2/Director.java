package p2e2;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Director extends Employee {

	private String area; 
	
	private List<Employee> subordinates = new ArrayList<>();
	
	Director(String name, Date birthday, int salary, String area) {
		super(name, birthday, salary);
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	public void addSubordinate(Employee employee) {
		this.subordinates.add(employee);
	}
	
	public Iterator<Employee> getSubordinates() {
		return this.subordinates.iterator();
	}

}
