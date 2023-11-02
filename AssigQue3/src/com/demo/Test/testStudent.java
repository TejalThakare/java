package com.demo.Test;

import java.util.Scanner;


import com.demo.Beans.StudentInfo;
import com.demo.StudentServices.StudentService;
import com.demo.StudentServices.StudentServiceImp;

public class testStudent {

	public static void main(String[] args) {
		StudentService ss=new StudentServiceImp();
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
		System.out.println("1. Display All Student \n2. Search by id\n3. Search by name\n4. calculate GPA of a student\n5. Exit");
		System.out.println("enter you choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			StudentInfo[] arr=ss.displayAll();
			for(StudentInfo p1:arr) {
				if(p1!=null)
				   System.out.println(p1);
				else
					break;
			}

			break;
		case 2:
			
			System.out.println("enter the id for which you nned to search");
			int id=sc.nextInt();
			StudentInfo s1=ss.displayById(id);
			if(s1!=null) {
				System.out.println(s1);
			}
			else {
				System.out.println("invalid input");
			}
			break;
		case 3:
			sc.nextLine();
			System.out.println("enter by wjhich name you need to search");
			String name=sc.nextLine();
			StudentInfo s2=ss.displayByName(name);
			if(s2!=null) {
			System.out.println(s2);
			}
			else {
				System.out.println("invalid input");
			}
			break;
		case 4: 
			
			System.out.println("enter the id for which you nned to search");
			int id3=sc.nextInt();
			int gpa=ss.calculateGpa(id3);
			System.out.println(gpa);
			
			break;
		case 5:
			sc.close();
			System.out.println("thankyou for visisting");
			break;
		default :
			System.out.println("invaid input");
		}
		}while(choice!=5);
	}

}
