package com.salary;

import java.time.LocalDate;

abstract public class Employee extends Person {
    private String dept;
    private String desg;
    private LocalDate doj;
    
    
//    default constructor
	public Employee() {
		super();
	}

//parametrized constructor
	public Employee(int id,String name,int mobnum,String emailid,String dept, String desg, LocalDate doj) {
		super(id,name,mobnum,emailid);
		this.dept = dept;
		this.desg = desg;
		this.doj = doj;
	}
//setters and getters
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
//to string
	@Override
	public String toString() {
		return super.toString()+"\nEmployee [dept=" + dept + ", desg=" + desg + ", doj=" + doj + "]";
	}
	
	abstract public double calculatesal();
}