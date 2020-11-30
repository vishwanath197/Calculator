import java.util.*;
import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choice, num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the first number");
		num1 = sc.nextInt();
		
		System.out.println("Enter the second number");
		num2 = sc.nextInt();
		
		System.out.println("choose the operation to be performed");
		choice = sc.nextInt();
		
		if (choice == 1 ) {
			System.out.println(num1 + num2);
		}
		else if (choice == 2) {
			System.out.println(num1 - num2); 
		}
		else if (choice == 3) {
			System.out.println(num1 * num2); 
			}
		else if (choice == 4) {
			System.out.println(num1 / num2); 
		}
		else if (choice == 5) {
			System.out.println(num1 % num2);
		}
		
		
	}

}
