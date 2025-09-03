package programs;

import java.util.Scanner;

public class EmployeeManagementSystem {

	public static void main(String[] args) {
		EmployeeManagement management = new EmployeeManagement();
		System.out.println("Employee management system");
		Scanner scanner = new Scanner(System.in);
		int choice = 0;

		do {
			System.out.println("\n-:: MENU OPTIONS ::-");
			System.out.println("1. Add Employee");
			System.out.println("2. Display Employees");
			System.out.println("3. Search Employee");
			System.out.println("4. Update Employee");
			System.out.println("5. Delete Employee");
			System.out.println("6. Sort Employee by name");
			System.out.println("7. Exit");
			System.out.print("\nEnter your choice: ");

			switch (choice) {
			case 1:
				System.out.println("\n-:: ADD EMPLOYEE ::-");
				System.out.print("Enter the employee id: ");
				String id = scanner.nextLine();
				System.out.print("Enter the employee name: ");
				String name = scanner.nextLine();
				System.out.print("Enter the employee designation: ");
				String designation = scanner.nextLine();
				System.out.print("Enter the employee salary: ");
				double salary = scanner.nextDouble();
				management.addEmployee(new Employee(id, name, designation, salary));
				scanner.nextLine();
				break;
			case 2:
				System.out.println("\n-:: DISPLAY EMPLOYEES ::-");
				management.displayEmployees();
				break;
			case 3:
				System.out.println("\n-:: SEARCH AN EMPLOYEE ::-");
				System.out.print("Enter the employee id to search: ");
				String searchId = scanner.nextLine();
				System.out.println(management.searchEmployee(searchId));
				break;
			case 4:
				System.out.println("\n-:: UPDATE AN EMPLOYEE ::-");
				System.out.print("Enter Employee ID to update: ");
				String updateId = scanner.nextLine();
				System.out.print("Enter New Name: ");
				String newName = scanner.nextLine();
				System.out.print("Enter New Designation: ");
				String newDes = scanner.nextLine();
				System.out.print("Enter New Salary: ");
				double newSalary = scanner.nextDouble();
				scanner.nextLine();
				management.updateEmployee(updateId, newName, newDes, newSalary);
				break;
			case 5:
				System.out.println("\n-:: DELETE AN EMPLOYEE ::-");
				System.out.print("Enter Employee ID to delete: ");
				String deleteId = scanner.nextLine();
				management.deleteEmployee(deleteId);
				break;
			case 6:
				System.out.println("\n-:: SORT EMPLOYEES BY NAME ::-");
				management.sortEmployeesByName();
				break;
			case 7:
				System.out.println("Exiting the program.");
				break;
			default:
				System.out.println("Invalid choice. Try again.");
				break;
			}
		} while (choice != 7);
		scanner.close();
	}
}
