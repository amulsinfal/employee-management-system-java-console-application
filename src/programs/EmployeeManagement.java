package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeManagement {

	private List<Employee> employees;

	public EmployeeManagement() {
		employees = new ArrayList<>();
	}

	public void addEmployee(Employee employee) {
		validateEmployee(employee);
		employees.add(employee);
		System.out.println("Employee created successfully.");
	}

	public void displayEmployees() {
		if (employees.isEmpty()) {
			System.out.println("No employees found.");
			return;
		}
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

	public Employee searchEmployee(String empId) {
		if (empId == null || empId.isBlank()) {
			throw new IllegalArgumentException("Employee ID cannot be null or empty.");
		}
		for (Employee employee : employees) {
			if (employee.getEmpId().equalsIgnoreCase(empId)) {
				System.out.println("Employee Found with Id: " + empId);
				return employee;
			}
		}
		throw new NoSuchElementException("Employee not found with ID: " + empId);
	}

	public Employee deleteEmployee(String empId) {
		Employee employee = searchEmployee(empId);
		employees.remove(employee);
		System.out.println("Employee deleted successfully with ID: " + empId);
		return employee;
	}

	public void updateEmployee(String uEmpId, String uEmpName, String uEmpDesignation, double uEmpSalary) {
		Employee employee = searchEmployee(uEmpId);
		employee.setEmpName(uEmpName);
		employee.setEmpDesignation(uEmpDesignation);
		employee.setEmpSalary(uEmpSalary);
		System.out.println("Employee updated successfully.");
	}

	public void sortEmployeesByName() {
		if (employees.isEmpty()) {
			System.out.println("No employees available to sort.");
			return;
		}
		List<Employee> sortedEmployees = new ArrayList<>(employees);
		Comparator<Employee> employeeNameComparator = new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getEmpName().compareTo(o2.getEmpName());
			}
		};
		Collections.sort(sortedEmployees, employeeNameComparator);
		for (Employee employee : sortedEmployees) {
			System.out.println(employee);
		}
	}

	// Validation

	private void validateEmployee(Employee employee) {
		validateEmpId(employee.getEmpId());
		validateEmpName(employee.getEmpName());
		validateEmpDesignation(employee.getEmpDesignation());
		validateEmpSalary(employee.getEmpSalary());
	}

	private boolean validateEmpId(String empId) {
		String empIdRegex = "E-[0-9]+$";
		Pattern empIdPattern = Pattern.compile(empIdRegex);
		Matcher empIdMatcher = empIdPattern.matcher(empId);
		if (empIdMatcher.matches()) {
			return true;
		} else {
			throw new IllegalArgumentException("Invalid Id Format. Please enter employee id in format: E-1");
		}
	}

	private boolean validateEmpName(String empName) {
		String nameRegex = "^[a-zA-Z\\s]+$";
		Pattern namePattern = Pattern.compile(nameRegex);
		Matcher nameMatcher = namePattern.matcher(empName);
		if (nameMatcher.matches()) {
			return true;
		} else {
			throw new IllegalArgumentException("Invalid name format. Please enter valid name containing only alphabets.");
		}
	}

	private boolean validateEmpDesignation(String designation) {
		if (designation.equals("Manager") || designation.equals("Lead") || designation.equals("Developer") || designation.equals("Tester") || designation.equals("Intern")) {
			return true;
		} else {
			throw new IllegalArgumentException("Invalid designation. Designation should be one of the following: Manager, Lead, Developer, Tester, Intern.");
		}
	}

	private boolean validateEmpSalary(double empSalary) {
		if (empSalary >= 0) {
			return true;
		} else {
			throw new IllegalArgumentException("Invalid salary. Salary cannot be negative.");
		}
	}
}
