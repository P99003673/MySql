package com.ltts.DemoSpringCons;

public class Employee {
  
	private int empid;
	private String empname;
	private String empaddress;
	
	public Employee(int empid, String empname, String empaddress) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empaddress = empaddress;
	}
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpaddress() {
		return empaddress;
	}
	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empaddress=" + empaddress + "]";
	}
	
	
	
	
}
