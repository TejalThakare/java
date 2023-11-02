package com.demo.Beans;

public class StudentInfo {
	private int studid;
	private String name;
	private int m1;
	private int m2;
	private int m3;
//	default constructor called
	
	public StudentInfo() {
		super();
	}
	
//	constructor called
	public StudentInfo(int studid,String name,int m1,int m2,int m3) {
		super();
		this.studid=studid;
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}

	
	
	public String toString() {
		return "Student details \n ------------------------------------------\nStudentid :"+studid+"\nname :"+name+"\nm1 :"+m1+"\nm2 :"+m2+"\nm3 :"+m3;
		
	}
//	setters getters
	public int getStudid() {
		return studid;
	}

	public void setStudid(int studid) {
		this.studid = studid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getM1() {
		return m1;
	}

	public void setM1(int m1) {
		this.m1 = m1;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	public int getM3() {
		return m3;
	}

	public void setM3(int m3) {
		this.m3 = m3;
	}

	public void calculateGpa() {
		 int gpa=(1/3)*m1+(1/2)*m2+(1/4)*m3;
		System.out.println("the GPA of the student is"+gpa); 
	}

}
