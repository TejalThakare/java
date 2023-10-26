import java.util.Scanner;

public class array1 {
	//Array1 Input
	public static void accept1(int[][] arr1) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter array elements");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[0].length;j++) {
			arr1[i][j]=sc.nextInt();
		}
		
	}

}
	//Array1` Display
	public static void display1(int[][] arr1) {
		
		System.out.println("enter array elements are");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[0].length;j++) {
			System.out.print(arr1[i][j] +"\t");	
	}
			System.out.println();
}
}
	//Array2 Accept
	public static void accept2(int[][] arr2) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter array elements");
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[0].length;j++) {
			arr2[i][j]=sc.nextInt();
		}
		
	}

}
	//Array2 Display
	public static void display2(int[][] arr2) {
		
		System.out.println("enter array elements are");
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[0].length;j++) {
			System.out.print(arr2[i][j] +"\t");	
	}
			System.out.println();
}
}
	//Addtion of Matrix
	public static void sumelement(int[][] arr1,int[][]arr2) {
		int[][]temp=new int[3][3];
		System.out.println("the sum of the matrix is :");
		for(int i=0;i<temp.length;i++) {
			for (int j=0;j<temp[0].length;j++) {
				temp[i][j]=arr1[i][j]+arr2[i][j];
				
				System.out.print(temp[i][j]+"\t");
			}
			System.out.println();
		}
	}
	//Transpose of Matrix
	public static void transpose(int[][]arr1) {
		int[][] temp=new int[3][3];
		System.out.println("transpose of matrix is :");
		for(int i=0;i<temp.length;i++) {
			for (int j=0;j<temp[0].length;j++) {
				temp[j][i]=arr1[i][j];
				
			}
		}
		for(int i=0;i<temp.length;i++) {
			for (int j=0;j<temp[0].length;j++) {
						System.out.print(temp[i][j]+"\t");
			}
		System.out.println();
	}
}
	//Min value of Matrix
	public static void min1(int[][] arr1) {
		int temp=arr1[0][0];
		 for (int i=0;i<arr1.length;i++) {
			 for(int j=0;j<arr1[0].length;j++) {
				 if(arr1[i][j]>temp) {
				    temp=arr1[i][j];
				      }
				 } 
			 }
		 System.out.println("the minimum element is :" +temp);

	}
//	 max value of matrix
	public static void max1(int[][] arr1) {
		int temp=arr1[0][0];
		 for (int i=0;i<arr1.length;i++) {
			 for(int j=0;j<arr1[0].length;j++) {
				 if(arr1[i][j]>temp) {
				    temp=arr1[i][j];
				     }
				} 
			 }
		 System.out.println("the maximum element is :" +temp);
	}
	
//	repeated count of element 
	public static void repeatCount(int[][] arr1) 
	{
		int temp=arr1[0][0];
		 for (int i=0;i<arr1.length;i++) 
		 {
			 for(int j=0;j<arr1[0].length;j++) 
			 {
				 if(arr1[i][j]>temp) 
				 {
				    temp=arr1[i][j];
				 }
			 } 
		 }
		      int count=0;
				    for (int i=0;i<arr1.length;i++) 
				    {
						 for(int j=0;j<arr1[0].length;j++) 
						 {
							 if(arr1[i][j]==temp)
							 {
							    count++;
	                         }
			
                          }
					}
				    System.out.println("the max value appeared is "+temp+" And count is" + count);	
	}
}

