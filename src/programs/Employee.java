package programs;

public class Employee {

	// variables.
	private String id;
	private String name;
	private String designation;
	private double salary;

	// Constructor
	public Employee(String id, String name, String designation, double salary) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	// Setters and Getters
	public String getEmpId() {
		return id;
	}

	public String getEmpName() {
		return name;
	}

	public String getEmpDesignation() {
		return designation;
	}

	public double getEmpSalary() {
		return salary;
	}

	public void setEmpName(String name) {
		this.name = name;
	}

	public void setEmpDesignation(String designation) {
		this.designation = designation;
	}

	public void setEmpSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}

}
