import java.util.Scanner;
public class Ninth {

	
	 public static void main(String[] args) 
	    {
	    	Scanner sc = new Scanner(System.in);
	    	
	    	System.out.println("Enter the First Number ");
	    	
	         int n = sc.nextInt();
	         System.out.println(round(n));
	         System.out.println("Enter the Second number");
	         int n1 = sc.nextInt();
	         System.out.println(round(n1));
	    }
	
	
	public static int round(int n)
    {
      return ((n/10)+1)* 10;
       }
     
}