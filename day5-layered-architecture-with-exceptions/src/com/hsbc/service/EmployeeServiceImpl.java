package com.hsbc.service;

import com.hsbc.beans.Employee;
import com.hsbc.dao.EmployeeDao;
import com.hsbc.dao.EmployeeDaoArrayImpl;
import com.hsbc.exceptions.EmployeeNotFoundException;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao dao = null;
	public EmployeeServiceImpl() {
		// this is wrong approach we need to use factory pattern
		dao = new EmployeeDaoArrayImpl();
	}

	@Override
	public void store(Employee employee) {
		dao.save(employee);
	}

	@Override
	public Employee findEmployee(int id) throws EmployeeNotFoundException {
		Employee emp = dao.fetchEmployeeById(id);
		if(emp == null) {
			throw new EmployeeNotFoundException("Sorry employee with an id " +id+" not found");
		}
		return emp;
	}

	@Override
	public Employee[] findAllEmployees() {
		return dao.findAllEmployees();
	}

	@Override
	public void updateSalary(int id, double salary) throws EmployeeNotFoundException{
		Employee[] temp = dao.findAllEmployees();
		Employee employee = null;
		for(Employee e: temp) {
			if(e.getId() == id) {
				employee = e;
				employee.setSalary(salary);
			}
		}
		if(employee == null) {
			throw new EmployeeNotFoundException("Sorry employee with an id " +id+" not found");
		}
		dao.updateEmployee(id, employee);
	}

	@Override
	public void updateName(int id, String name) throws EmployeeNotFoundException{
		Employee[] temp = dao.findAllEmployees();
		Employee employee = null;
		for(Employee e: temp) {
			if(e.getId() == id) {
				employee = e;
				employee.setName(name);;
			}
		}
		if(employee == null) {
			throw new EmployeeNotFoundException("Sorry employee with an id " +id+" not found");
		}
		dao.updateEmployee(id, employee);
	}

}