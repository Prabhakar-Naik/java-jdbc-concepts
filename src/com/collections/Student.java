package com.collections;

public class Student {

	private int sid;
	private String sname;
	private String location;
	private String course;
	private double fee;
	private String dpmt;
	
	public String getDpmt() {
		return dpmt;
	}


	public void setDptm(String dpmt) {
		this.dpmt = dpmt;
	}

	public Student() {
		super();
		
	}
	

	public Student(int sid, String sname, String location, String course,double fee,String dpmt) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.location = location;
		this.course = course;
		this.fee = fee;
		this.dpmt=dpmt;
	}


	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", location=" + location + ", course=" + course + ", fee="
				+ fee +", Department="+dpmt+ "]";
	}
	
	
}
