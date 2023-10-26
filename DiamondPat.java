
import java.util.Scanner;
public class DiamondPat {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter the number of rows (odd number): ");
	        int n = input.nextInt();

	        if (n % 2 == 0) {
	            System.out.println("Please enter an odd number.");
	            return;
	        }

	        int spaces = n / 2;
	        int stars = 1;

	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= spaces; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= stars; j++) {
	                System.out.print("*");
	            }
	            System.out.println();

	            if (i <= n / 2) {
	                spaces--;
	                stars += 2;
	            } else {
	                spaces++;
	                stars -= 2;
	            }
	        }
	    }
	}

