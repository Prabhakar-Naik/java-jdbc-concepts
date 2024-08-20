package com.Jdbc.EmployeeCrud.java8;

public class Employee {

	private int empId;
	private String empName;
	private String Gender;
	private String Role;
	private String Location;
	private String techDetails;
	
	public Employee() {
		super();
		
	}

	public Employee(int empId, String empName, String gender, String role, String location, String techDetails) {
		super();
		this.empId = empId;
		this.empName = empName;
		Gender = gender;
		Role = role;
		Location = location;
		this.techDetails = techDetails;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public String getTechDetails() {
		return techDetails;
	}

	public void setTechDetails(String techDetails) {
		this.techDetails = techDetails;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", Gender=" + Gender + ", Role=" + Role
				+ ", Location=" + Location + ", techDetails=" + techDetails + "]";
	}
	
	
	
}
