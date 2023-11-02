package com.salary;

public class Person {
	private int id;
	private String name;
	private int mobnum;
	private String emailid;
	
//	construction of default constructor
	public  Person() {
		this(0,null,0,null);
	}
//	construction of parametrized constructor
	public Person(int id,String name,int mobnum,String emailid)
	{
		this.id=id;
		this.name=name;
		this.mobnum=mobnum;
		this.emailid=emailid;
		
	}
//	setters
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setmobNum(int mobnum) {
		this.mobnum=mobnum;
	}
	public void setEmailId(String emailid) {
		this.emailid=emailid;
	}
//	getters
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public int getMobNum() {
		return this.mobnum;
	}
	public String getEmailId() {
		return this.emailid;
	}
//	to string
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", mobnum=" + mobnum + ", emailid=" + emailid + "]";
	}
	

	
	
}
