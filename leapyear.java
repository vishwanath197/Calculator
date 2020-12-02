package basic;
import java.util.Scanner;
public class Check_leapyear {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter year:");
		int year = sc.nextInt();
		
		if( year % 400==0){
			
			System.out.println("The year is a :" + "Leap year");
			
		}
		else if( year % 4 == 0 && year != 0)
		{
			System.out.println("The year is a :" + "Leap year");
		}
		else {
			System.out.println("The year is not a leap year:" + "Not a Leap year");
			
		sc.close();
		
		}
	}
