package com.hsbc.dao;

import java.util.Set;
import java.util.TreeSet;

import com.hsbc.beans.Employee;
import com.hsbc.exceptions.EmployeeAlreadyExistException;

public class EmployeeDaoTreeSetimpl implements EmployeeDao{
	private static Set<Employee> employeeSet = new TreeSet<Employee>();
	public EmployeeDaoTreeSetimpl() {
		System.out.println("EmployeeDaoTreeSetImpl() created");
	}
	@Override
	public void save(Employee employee) throws EmployeeAlreadyExistException {
		employeeSet.add(employee);
	}

	@Override
	public Employee fetchEmployeeById(int id) {
		Employee employee = null;
		for(Employee e: employeeSet) {
			if(e.getId() == id) {
				employee = e;
				break;
			}
		}
		return employee;
		
	}

	@Override
	public Employee[] findAllEmployees() {
		Employee[] emp = employeeSet.toArray(new Employee[employeeSet.size()]);
		return emp;
	}

	@Override
	public void updateEmployee(int id, Employee employee) {
		for(Employee e: employeeSet) {
			if(employeeSet.contains(e.getId() == id)){
				employeeSet.remove(e);
				employeeSet.add(employee);
			}
		}
	}

}
