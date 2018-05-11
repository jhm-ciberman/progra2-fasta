package p2e2;

import java.util.Date;

public class User {
	private String name;
	private Date birthday;
	
	User(String name, Date birthday) {
		this.setName(name);
		this.setBirthday(birthday);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
}
