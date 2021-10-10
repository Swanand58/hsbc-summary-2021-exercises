package com.hsbc.ViewController;

import java.util.Scanner;

import com.hsbc.beans.Employee;
import com.hsbc.service.EmployeeService;
import com.hsbc.service.EmployeeServiceImpl;

public class ViewController {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		EmployeeService service = new EmployeeServiceImpl();
		int controllerOption = 0;
		do {
			System.out.println("Enter options:-");
			System.out.println("1: Store employee 2: Find employee by id 3: Find All employees 4: Update Name 5: Update Salary 0: Exit");
			controllerOption = scan.nextInt();
			switch(controllerOption) {
			case 1: 
				System.out.println("--- Enter employee details ------");
				Employee emp = new Employee();
				System.out.println("Enter id");
				emp.setId(scan.nextInt()); // instead of int id = scan.nextInt(); emp.setId(id);
				System.out.println("Enter name");
				emp.setName(scan.next());
				System.out.println("Enter salary");
				emp.setSalary(scan.nextDouble());
				service.store(emp);
				System.out.println("Successfully stored.....");
				System.out.println("---------------------------------");
				break;
			case 2:
				System.out.println("Enter the id of the employee you want to find!");
				int id = scan.nextInt();
				Employee empId = service.findEmployee(id);
				System.out.println("Hello "+empId.getName()+", Your salary is: "+empId.getSalary()+" and id is: "+empId.getId());
				
				break;
			case 3: 
				Employee[] employees = service.findAllEmployees();
				for(Employee e : employees) {
					System.out.println("Hello "+e.getName()+", Your salary is: "+e.getSalary()+" and id is : "+e.getId());
				}
				break;
			case 4:
				System.out.println("Enter the id of the Employee for which you want to change the name:");
				int nameId = scan.nextInt();
				System.out.println("Enter the Name you want to set:");
				String name = scan.next();
				service.updateName(nameId, name);
				System.out.println("Employee Details Updated!");
				break;
				
			case 5:
				System.out.println("Enter the id of the Employee for which you want to change the Salary:");
				int salaryId = scan.nextInt();
				System.out.println("Enter the Salary you want to set:");
				double salary = scan.nextDouble();
				service.updateSalary(salaryId, salary);
				System.out.println("Employee Details Updated!");
				break;
			}
		} while(controllerOption != 0);
		scan.close();
	}
	
}