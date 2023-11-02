package com.salary;

import java.time.LocalDate;

public class VendorEmp extends Employee {
	private int noemp;
	private int amt;
	
//	default constructor
	public VendorEmp() {
		super();
	}
//	Parameterized constructor
	
	public VendorEmp(int id,String name,int mobnum,String emailid,String dept, String desg, LocalDate doj,int noemp, int amt) {
		super(id,name,mobnum,emailid,dept,desg,doj);
		this.noemp = noemp;
		this.amt = amt;
	}
	
//	getter setter
	
	public int getNoemp() {
		return noemp;
	}
	public void setNoemp(int noemp) {
		this.noemp = noemp;
	}
	public int getAmt() {
		return amt;
	}
	public void setAmt(int amt) {
		this.amt = amt;
	}
//	to string method
	@Override
	public String toString() {
		return super.toString()+"VendorEmp [noemp=" + noemp + ", amt=" + amt + "]";
	}
	
	 public double calculatesal() {
		 return noemp*amt;
	 }
	
	

}
