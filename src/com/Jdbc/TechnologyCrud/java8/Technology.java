package com.Jdbc.TechnologyCrud.java8;

public class Technology {

	private String techId;
	private String usingTech;
	private String Version;
	private String techCompany;
	private String Scope;
	private int empId;
	
	public Technology() {
		super();
		
	}

	public Technology(String techId, String usingTech, String version, String techCompany, String scope,int empId) {
		super();
		this.techId = techId;
		this.usingTech = usingTech;
		Version = version;
		this.techCompany = techCompany;
		Scope = scope;
		this.empId=empId;
	}

	public String getTechId() {
		return techId;
	}
	
	public void setTechId(String techId) {
		this.techId=techId;
	}
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getUsingTech() {
		return usingTech;
	}

	public void setUsingTech(String usingTech) {
		this.usingTech = usingTech;
	}

	public String getVersion() {
		return Version;
	}

	public void setVersion(String version) {
		Version = version;
	}

	public String getTechCompany() {
		return techCompany;
	}

	public void setTechCompany(String techCompany) {
		this.techCompany = techCompany;
	}

	public String getScope() {
		return Scope;
	}

	public void setScope(String scope) {
		Scope = scope;
	}

	@Override
	public String toString() {
		return "Technology [techId=" + techId + ", usingTech=" + usingTech + ", Version=" + Version + ", techCompany="
				+ techCompany + ", Scope=" + Scope + " empId="+ empId+"]";
	}
	
	
}
