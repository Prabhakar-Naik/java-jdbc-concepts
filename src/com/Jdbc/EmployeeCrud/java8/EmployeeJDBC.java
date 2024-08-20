package com.Jdbc.EmployeeCrud.java8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeJDBC {
	
	private static String dbDriver="oracle.jdbc.driver.OracleDriver";
	private static String dbUrl="jdbc:oracle:thin:@localhost:1521:xe";
	private static String dbUser="prabhakar";
	private static String dbPwd="prabha225";
	
	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//TableCreation
		try {
			Class.forName(dbDriver);
			
			Connection con=DriverManager.getConnection(dbUrl,dbUser,dbPwd);
			
			Statement st=con.createStatement();
			
			//write query 
			String query="create table AshokItEmployee (empId number(10) primary key,empNAME varchar2(15),Gender varchar2(5),"
					+ " Role varchar2(20), location varchar2(40), techDetails varchar2(25))";
			
			st.executeUpdate(query);
			
				System.out.println("Table Create successfully...");
			
			con.close();
			st.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//Insert Record
	public void insertData() {
		
			Employee emp=new Employee();
		
		try {
			Class.forName(dbDriver);
			Connection con=DriverManager.getConnection(dbUrl,dbUser,dbPwd);
			
			while(true) {
				
				int count=0;
				
				System.out.println("Enter Employee Id:");
				int id=sc.nextInt();
				System.out.println("Enter Employee Name: ");
				String name=sc.next();
				System.out.println("Enter Employee Gender: ");
				String gender=sc.next();
				System.out.println("Enter Employee Location: ");
				String location=sc.next();
				System.out.println("Enter Employee Role: ");
				String role=sc.next();
				System.out.println("Enter Employee techRole: ");
				String tech=sc.next();
				
				
				emp.setEmpId(id);
				emp.setEmpName(name);
				emp.setGender(gender);
				emp.setLocation(location);
				emp.setRole(role);
				emp.setTechDetails(tech);
			
			
			
				int empId=emp.getEmpId();
				String empName=emp.getEmpName();
				String gen=emp.getGender();
				String rol=emp.getRole();
				String loc=emp.getLocation();
				String tec=emp.getTechDetails();
			
				PreparedStatement st=con.prepareStatement("insert into AshokItEmployee values(?,?,?,?,?,?)");
			
				st.setInt(1, empId);
				st.setString(2, empName);
				st.setString(3, gen);
				st.setString(4, rol);
				st.setString(5, loc);
				st.setString(6, tec);
			
				count=st.executeUpdate();
			
				if(count>0)
				{
					System.out.println("Record Successfully inserted...");
				}
				else
					System.out.println("Record not inserted...");
			
				//System.out.println(employees+"\n");
			
				System.out.println("Do you want to insert more records yes or no: ");
				String ch=sc.next();
			
				if(ch.equalsIgnoreCase("no"))
				{
					System.out.println("Connection terminated...");
					break;
				}
			}
		}
		catch(Exception e) {
			System.out.println("Exception: "+e);
		}
		
	}


	
	//Update Record
	public void updateData() {
		
		
		while(true) {
			
		int count=0;
		Employee emp=new Employee();
		
		System.out.println("Enter Employee ID for update: ");
		int empId=sc.nextInt();
		
		findById(empId);
		
		try {
		Class.forName(dbDriver);
		
		Connection con=DriverManager.getConnection(dbUrl,dbUser,dbPwd);
		
		Statement st=con.createStatement();
		
		System.out.println("Enter Employee Name: ");
		String name=sc.next();
		System.out.println("Enter Employee Gender: ");
		String gender=sc.next();
		System.out.println("Enter Employee Location: ");
		String location=sc.next();
		System.out.println("Enter Employee Role: ");
		String role=sc.next();
		System.out.println("Enter Employee techRole: ");
		String tech=sc.next();
		

		emp.setEmpName(name);
		emp.setGender(gender);
		emp.setLocation(location);
		emp.setRole(role);
		emp.setTechDetails(tech);
		
		count=st.executeUpdate("update ASHOKITEMPLOYEE set EMPNAME='"+name+"', GENDER='"+gender+"', ROLE='"+role+"', LOCATION='"+location+"', TECHDETAILS='"+tech+"' where EMPID ="+empId);
		
		if(count>0)
		{
			System.out.println("Record Successfully updated...");
		}
		else
			System.out.println("Record not updated...");
		
		
		
		System.out.println("Do you want to update more records yes or no: ");
		String ch=sc.next();
		
		if(ch.equalsIgnoreCase("no"))
		{
			System.out.println("Connection terminated...");
			break;
		}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
	//Select One Employee Record
	public void findById(int empId) {
		
		try {
			
			Class.forName(dbDriver);
			
			Connection con=DriverManager.getConnection(dbUrl,dbUser,dbPwd);
			
			Statement st=con.createStatement();
			
			ResultSet rs=st.executeQuery("select * from AshokItEmployee where empId="+empId);
			
			while(rs.next()) {
				
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String gender=rs.getString(3);
				String role=rs.getString(4);
				String location=rs.getString(5);
				String tech=rs.getString(6);
				
				
				System.out.println("Employee Id: "+id);
				System.out.println("Employee Name: "+name);
				System.out.println("Employee Gender: "+gender);
				System.out.println("Employee Role: "+role);
				System.out.println("Employee Location: "+location);
				System.out.println("Employee TechDetails: "+tech);
				
				System.out.println("==============");
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	//Delete Employee Record
	public int deleteById() {
	
			int count=0;
		
			try {
			
				Class.forName(dbDriver);
			
				Connection con=DriverManager.getConnection(dbUrl,dbUser,dbPwd);
			
				Statement st=con.createStatement();
			
			 
			
				while(true) {
						System.out.println("Enter employee ID for deletion:");
						int empId=sc.nextInt();
					
		
					
						count=st.executeUpdate("delete from AshokItEmployee where empId="+empId);
						if(count>0)
							System.out.println(count+" record deleted....");
						else
							System.out.println("no record deleted...");
					
						System.out.println("Do you want to delete more records...[yes/no]");
					
						String ch=sc.next();
						if(ch.equalsIgnoreCase("no")) {
							System.out.println("you choosing exit");
							break;
						}
				}
			 
			 
			}catch(Exception e) {
				e.printStackTrace();
			}
		
			return count;	
	}
	
	//Select All Records from database
	public void findAll() {
		
		try {
			
			Class.forName(dbDriver);
			
			Connection con=DriverManager.getConnection(dbUrl,dbUser,dbPwd);
			
			Statement st=con.createStatement();
			
			ResultSet rs=st.executeQuery("select * from AshokItEmployee");
			
			while(rs.next()) {
				
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String gender=rs.getString(3);
				String role=rs.getString(4);
				String location=rs.getString(5);
				String tech=rs.getString(6);
				
				
				System.out.println("Employee Id: "+id);
				System.out.println("Employee Name: "+name);
				System.out.println("Employee Gender: "+gender);
				System.out.println("Employee Role: "+role);
				System.out.println("Employee Location: "+location);
				System.out.println("Employee TechDetails: "+tech);
				
				System.out.println("==============");
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	
	}
	
	
}
