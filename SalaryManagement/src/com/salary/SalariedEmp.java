package com.salary;

import java.time.LocalDate;

public class SalariedEmp extends Employee {
	private int bonus;
	private int basicsal;
	
	
//	default constructor
	public SalariedEmp() {
		super();
	}
//parametrized constructor


	public SalariedEmp(int id,String name,int mobnum,String emailid,String dept, String desg, LocalDate doj,int bonus, int basicsal) {
		super(id,name,mobnum,emailid,dept,desg,doj);
		this.bonus = bonus;
		this.basicsal = basicsal;
	}

//	getter setter
	
	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public int getBasicsal() {
		return basicsal;
	}

	public void setBasicsal(int basicsal) {
		this.basicsal = basicsal;
	}
//to string


	@Override
	public String toString() {
		return super.toString()+"\nSalariedEmp [bonus=" + bonus + ", basicsal=" + basicsal + "]";
	}
	 public double calculatesal() {
		 return basicsal+0.1*basicsal+0.5;
	 }
	
}
