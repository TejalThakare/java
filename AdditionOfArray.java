import java.util.Scanner;

public class AdditionOfArray {

	public static void main(String[]args) {

		int [][] arr2=new int[3][3];
		int [][] arr1=new int[3][3];
		array1.accept1(arr1);
		array1.display1(arr1);
		array1.accept2(arr2);
		array1.display2(arr2);
		System.out.println("Enter 1:Addition of array \t Enter 2:Transpose \t Enter 3:Minimum \t Enter 4: Maximum \t Enter 5: Repeatation of elements\t Enter 6:Exit\t");

		Scanner sc=new Scanner(System.in);
		int num=0;
		do{
			System.out.println("Enter the choice:");
			num=sc.nextInt();
			int x=num;
			switch(x)
			{
			case 1:
				array1.sumelement(arr1,arr2);
				break;
			case 2:
				array1.transpose(arr1);
				break;
			case 3:
				array1.min1(arr1);
				break;
			case 4:
				array1.max1(arr1);
				break;
			case 5:
				array1.repeatCount(arr1);
				break;
			}
			System.out.println("do you want to continue press 1");
			num=sc.nextInt();

		}while(num!=0);
		System.out.println("Exit");


	}	


}


