package p2e2;

import java.util.Date;

public class Employee extends User {

	private int salary;
	
	Employee(String name, Date birthday, int salary) {
		super(name, birthday);
		this.setSalary(salary);
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
