package p2e2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Enterprise {
	private List<Client> clients = new ArrayList<>();
	private List<Employee> employees = new ArrayList<>();
	
	public void addClient(Client client) {
		this.clients.add(client);
	}
	public void removeClient(Client client) {
		this.clients.remove(client);
	}
	public void addEmployee(Employee employee) {
		this.employees.add(employee);
	}
	public void removeEmployee(Employee employee) {
		this.employees.remove(employee);
	}
	public Iterable<Client> getClients() {
		return (Iterable<Client>) this.clients;
	}
	
}
