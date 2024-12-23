package com.Rushikesh;

public class Employee {
	int empId;
	String empFirstName;
	String empLastName;
	int salary;
	
	Employee()
	{
		
	}
	
	Employee(int id, String firstName, String lastName, int salary)
	{
		this.empId = id;
		this.empFirstName = firstName;
		this.empLastName = lastName;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void displayEmp()
	{
		System.out.println();
		System.out.println("Employee id: "+this.empId);
		System.out.println("Employee First Name: "+this.empFirstName);
		System.out.println("Employee last Name: "+this.empLastName);
		System.out.println("Salary: "+this.salary);
	}
}
