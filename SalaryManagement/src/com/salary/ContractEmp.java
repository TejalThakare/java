package com.salary;

import java.time.LocalDate;

public class ContractEmp extends Employee{
	private int hrs;
	private int charges;
	
//	default constructor
	public ContractEmp() {
		super();
	}
//	parametrized constructor
	public ContractEmp(int id,String name,int mobnum,String emailid,String dept, String desg, LocalDate doj,int hrs, int charges) {
		super(id,name,mobnum,emailid,dept,desg,doj);
		this.hrs = hrs;
		this.charges = charges;
	}

//setter getter
	public int getHrs() {
		return hrs;
	}
	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	public int getCharges() {
		return charges;
	}
	public void setCharges(int charges) {
		this.charges = charges;
	}
//to string 
@Override
	public String toString() {
		return super.toString()+"\nContractEmp [hrs=" + hrs + ", charges=" + charges + "]";
	}	

public double calculatesal() {
	 return hrs*charges;
}
}
