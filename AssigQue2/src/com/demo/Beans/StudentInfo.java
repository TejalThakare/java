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
	

}
