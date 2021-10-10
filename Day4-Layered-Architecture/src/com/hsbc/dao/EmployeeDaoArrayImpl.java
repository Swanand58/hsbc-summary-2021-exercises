package com.hsbc.dao;

import com.hsbc.beans.Employee;

public class EmployeeDaoArrayImpl implements EmployeeDao {

	private static Employee[] employeeDb = new Employee[10];
	private static int arrayIndexCounter = 0;
	@Override
	public void save(Employee employee) {
		employeeDb[arrayIndexCounter] = employee;
		arrayIndexCounter++;
	}
	@Override
	public Employee fetchEmployeeById(int id) {
		
		Employee[] empArray = findAllEmployees();
		Employee employee = null;
		for(Employee e : empArray) {
			if(e.getId() == id) {
				employee = e;
				break;
			}
		}
		if(employee == null) {
			System.out.println("Sorry User not found!");
		}
		return employee;
	}
	@Override
	public Employee[] findAllEmployees() {
		Employee[] tempDb = new Employee[arrayIndexCounter];
		for(int index = 0; index < arrayIndexCounter; index++) {
			tempDb[index] = employeeDb[index];
		}
		return tempDb;
	}
	@Override
	public void updateEmployeeSalary(int id, double salary) {
		Employee[] empArray = findAllEmployees();
		Employee employeeUpdate = null;
		for(Employee e : empArray) {
			if(e.getId() == id) {
				employeeUpdate = e;
				break;
			}
		}
		employeeUpdate.setSalary(salary);
		save(employeeUpdate);
	}
	@Override
	public void updateEmployeeName(int id, String name) {
		Employee[] empArray = findAllEmployees();
		Employee employeeUpdate = null;
		for(Employee e : empArray) {
			if(e.getId() == id) {
				employeeUpdate = e;
				break;
			}
		}
		employeeUpdate.setName(name);
		save(employeeUpdate);
		
	}
}
