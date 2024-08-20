package com.Jdbc.TechnologyCrud.java8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class TechnologyJDBC {

	private static String dbDriver="oracle.jdbc.driver.OracleDriver";
	private static String dbUrl="jdbc:oracle:thin:@localhost:1521:xe";
	private static String dbUser="prabhakar";
	private static String dbPwd="prabha225";

	Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {

		try {
			Class.forName(dbDriver);

			Connection con=DriverManager.getConnection(dbUrl,dbUser,dbPwd);

			Statement st=con.createStatement();


			//write query 
			String query="create table AshokItTechnology (techId varchar2(10) primary key,usingTech varchar2(15),Version varchar2(10),"
					+ " techCompany varchar2(30), Scope varchar2(10), empId number(10), FOREIGN KEY (empId) REFERENCES AshokItEmployee(empId))";

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

		Technology tech=new Technology();

		try {
			Class.forName(dbDriver);
			Connection con=DriverManager.getConnection(dbUrl,dbUser,dbPwd);

			while(true) {

				int count=0;

				System.out.println("Enter Technology ID: ");
				String tId=sc.next();
				System.out.println("Enter Using Technology: ");
				String utech=sc.next();
				System.out.println("Enter Technology Version: ");
				String vers=sc.next();
				System.out.println("Enter TechCompany Name: ");
				String company=sc.next();
				System.out.println("Enter Scope for Technolgy in future: ");
				String sco=sc.next();
				System.out.println("Enter Employee Id: ");
				int empid=sc.nextInt();

				tech.setTechId(tId);
				tech.setUsingTech(utech);
				tech.setVersion(vers);
				tech.setTechCompany(company);
				tech.setScope(sco);
				tech.setEmpId(empid);


				String techId=tech.getTechId();
				String usingTech=tech.getUsingTech();
				String Version=tech.getVersion();
				String techCompany=tech.getTechCompany();
				String Scope=tech.getScope();
				int empId=tech.getEmpId();

				PreparedStatement st=con.prepareStatement("insert into AshokItTechnology values(?,?,?,?,?,?)");

				st.setString(1, techId);
				st.setString(2, usingTech);
				st.setString(3, Version);
				st.setString(4, techCompany);
				st.setString(5, Scope);
				st.setInt(6, empId);

				count=st.executeUpdate();

				if(count>0)
					System.out.println("Record Inserted successfully...!");
				else
					System.out.println("Record Not Inserted....!");

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
			e.printStackTrace();
		}

	}

	public void UpdateData() {

		Technology tech=new Technology();

		System.out.println("Enter TechId for Updating: ");
		String tId=sc.next();

		findById(tId);


		//write more content
		while(true) {

			try 
			{
				Class.forName(dbDriver);
				Connection con=DriverManager.getConnection(dbUrl,dbUser,dbPwd);

				Statement st=con.createStatement();
				int count=0;

				System.out.println("Enter Using Technology: ");
				String utech=sc.next();
				System.out.println("Enter Technology Version: ");
				String vers=sc.next();
				System.out.println("Enter TechCompany Name: ");
				String company=sc.next();
				System.out.println("Enter Scope for Technolgy in future: ");
				String sco=sc.next();
				System.out.println("Enter Employee Id: ");
				int empid=sc.nextInt();


				tech.setUsingTech(utech);
				tech.setVersion(vers);
				tech.setTechCompany(company);
				tech.setScope(sco);
				tech.setEmpId(empid);

				count=st.executeUpdate("update AshokItTechnology set usingtech='"+utech+"', version='"+vers+"', techcompany='"+company+"', scope='"+sco+"', empid="+empid+" where techid='"+tId+"'");

				if(count>0)
					System.out.println("Record Inserted successfully...!");
				else
					System.out.println("Record Not Inserted....!");

				System.out.println("Do you want to insert more records yes or no: ");
				String ch=sc.next();

				if(ch.equalsIgnoreCase("no"))
				{
					System.out.println("Connection terminated...");
					break;
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}


	}

	public void findById(String Id) {


		try 
		{
			Class.forName(dbDriver);
			Connection con=DriverManager.getConnection(dbUrl,dbUser,dbPwd);

			Statement st=con.createStatement();

			ResultSet rs=st.executeQuery("select * from ASHOKITTECHNOLOGY where TECHID='"+Id+"'");

			while(rs.next()) {

				String tId=rs.getString(1);
				String useTech=rs.getString(2);
				String version=rs.getString(3);
				String Company=rs.getString(4);
				String scope=rs.getString(5);
				int empId=rs.getInt(6);

				System.out.println("Technology Id: "+tId);
				System.out.println("Using Technology: "+useTech);
				System.out.println("Technology version: "+version);
				System.out.println("Technology Company: "+Company);
				System.out.println("Technology scope: "+scope);
				System.out.println("Employee Id: "+empId);
				System.out.println("=========================");
			}

		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

	public int deleteById() {

		int count=0;

		try {

			Class.forName(dbDriver);

			Connection con=DriverManager.getConnection(dbUrl,dbUser,dbPwd);

			Statement st=con.createStatement();

			while(true) {

				System.out.println("Enter Technology Id for Deletion: ");
				String tid=sc.next();

				count=st.executeUpdate("delete from ASHOKITTECHNOLOGY where techId='"+tid+"'");

				if(count>0) {
					System.out.println(count+" Record deleted..!");
				}
				else {
					System.out.println("No Records deleted...!");
				}

				System.out.println("Do you want to delete more records...[yes/no]");

				String ch=sc.next();
				if(ch.equalsIgnoreCase("no")) {
					System.out.println("you choosing exit");
					break;
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		return count;
	}

	public void findAll() {


		try 
		{
			Class.forName(dbDriver);
			Connection con=DriverManager.getConnection(dbUrl,dbUser,dbPwd);

			Statement st=con.createStatement();

			ResultSet rs=st.executeQuery("select * from ASHOKITTECHNOLOGY");

			while(rs.next()) {

				String tId=rs.getString(1);
				String useTech=rs.getString(2);
				String version=rs.getString(3);
				String Company=rs.getString(4);
				String scope=rs.getString(5);
				int empId=rs.getInt(6);

				System.out.println("Technology Id: "+tId);
				System.out.println("Using Technology: "+useTech);
				System.out.println("Technology version: "+version);
				System.out.println("Technology Company: "+Company);
				System.out.println("Technology scope: "+scope);
				System.out.println("Employee Id: "+empId);
				System.out.println("=========================");
			}

		}
		catch(Exception e) {
			e.printStackTrace();
		}


	}

}
