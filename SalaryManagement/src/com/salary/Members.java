package com.salary;

public class Members extends Person{
	private String Member;
	private int amt;
	
//	default constructor
	public Members() {
		super();
	}
//	Parameterized constructor
	public Members(int id,String name,int mobnum,String emailid,String member, int amt) {
		super(id,name,mobnum,emailid);
		Member = member;
		this.amt = amt;
	}
//	setter getters
	public String getMember() {
		return Member;
	}

	public void setMember(String member) {
		Member = member;
	}
	public int getAmt() {
		return amt;
	}
	public void setAmt(int amt) {
		this.amt = amt;
	}
//	to string 
	@Override
	public String toString() {
		return super.toString()+"\nMembers [Member=" + Member + ", amt=" + amt + "]";
	}
	
	

}
