package com.salary;

import java.time.LocalDate;
import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
//		SalariedEmp semp=new SalariedEmp(1,"tejal",98765,"tejal@123","entc","hod",LocalDate.of(2000,03,15),2000,10000);
//		System.out.println(semp);
//		ContractEmp cemp=new ContractEmp(2,"saurabh",7896,"saurabh@123","civil","coor",LocalDate.of(2001,10,19),30,12000);
//		System.out.println(cemp);
//		VendorEmp vemp=new VendorEmp(3,"raj",56789,"raj@123","comp","student",LocalDate.of(2002,03,21),15,70000);
//		System.out.println(vemp);
//		Employee e1=new Employee(1,"Tejal",98765,"tejal@123","entc","hod",LocalDate.of(2000,03,15));
//		System.out.println(e1);
//		Person p1=new Employee(1,"Tejal",87765,"tejlal@123","enyc","hod",LocalDate.of(2000,03,01)); 
//		System.out.println(((Employee)p1).getDesg());
//		Person p2=new ContractEmp(1,"Tejal",87765,"tejlal@123","enyc","hod",LocalDate.of(2000,03,01),30,120000); 
//		ContractEmp s= (ContractEmp)p2;//person -->contract
//		System.out.println(s.getHrs());
//		//System.out.println(((ContractEmp)p1).getHrs());
//		VendorEmp v=new VendorEmp(3,"raj",56789,"raj@123","comp","student",LocalDate.of(2002,03,21),15,70000);
//		System.out.println(v.getName());
//		
//		Employee e5= new VendorEmp(3,"raj",56789,"raj@123","comp","student",LocalDate.of(2002,03,21),15,70000);
//		VendorEmp v5= (VendorEmp)e5;
//		System.out.println(v5.getAmt());
//		

//	static polymorphism
//		VendorEmp v=new VendorEmp(3,"raj",56789,"raj@123","comp","student",LocalDate.of(2002,03,21),15,70000);
//		System.out.println(v.calculatesal());
//		ContractEmp cemp=new ContractEmp(2,"saurabh",7896,"saurabh@123","civil","coor",LocalDate.of(2001,10,19),30,12000);
//		System.out.println(cemp.calculatesal());
//		SalariedEmp semp=new SalariedEmp(1,"tejal",98765,"tejal@123","entc","hod",LocalDate.of(2000,03,15),2000,10000);
//		System.out.println(semp.calculatesal());

		
//dynamic polymorphism
		int choice;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("enter which calulate function you need to call \n1:salaried employee\n2:contractemployee\n3:vendoremployee");
			System.out.println("enter the number");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				SalariedEmp semp=new SalariedEmp(1,"tejal",98765,"tejal@123","entc","hod",LocalDate.of(2000,03,15),2000,10000);
				System.out.println(semp.calculatesal());
				break;
				
			case 2:
				ContractEmp cemp=new ContractEmp(2,"saurabh",7896,"saurabh@123","civil","coor",LocalDate.of(2001,10,19),30,12000);
				System.out.println(cemp.calculatesal());
				break;
				
			case 3:
				VendorEmp vemp=new VendorEmp(3,"raj",56789,"raj@123","comp","student",LocalDate.of(2002,03,21),15,70000);
				System.out.println(vemp.calculatesal());
				break;
			
			case 4:
				sc.close();
				System.out.println("thankyou for visiting ");
				break;
				
			default :
				System.out.println("Invalid Input");
				
				
		}
		
	}while(choice!=4);

}
}
