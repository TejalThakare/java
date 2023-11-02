package com.demo.dao;

import com.demo.Beans.StudentInfo;

public class StudentdaoImp implements Studentdao {
	 static StudentInfo[] parr;
	 private static int cnt;
	 static {
		 parr=new StudentInfo[100];
		 parr[0]=new StudentInfo(1,"tejal",89,90,78);
		 parr[1]=new StudentInfo(2,"ashu",90,67,54);
		 parr[2]=new StudentInfo(3,"harsha",67,90,100);
		 parr[3]=new StudentInfo(4,"abhi",45,70,89);
		 parr[4]=new StudentInfo(5,"rudu",21,89,59);
		 cnt=4;
	 }
	@Override
	public StudentInfo[] findAll() {
		for (int i=0;i<cnt;i++) {
			return parr;
		}
		return null;
	}
	
	@Override
	public StudentInfo findById(int id) {
		for (int i=0;i<cnt;i++) {
			if(parr[i].getStudid()==id) {
				return parr[i];
				
			}
		}
		return null;
	}

	@Override
	public StudentInfo findByName(String name) {
		for (int i=0;i<cnt;i++) {
			if(parr[i].getName().equals(name)) {
				return parr[i];
			}
		}
		return null;
	}

	@Override
	public int calculateGpa(int id3) {

		int gpa= (int)(parr[id3].getM1()/3)+(int)(parr[id3].getM2()/2)+(int)(parr[id3].getM3()/4);
		return gpa;
	}


}
