
import java.util.*;
public class OddEven {
  public static void main(String args[])
  {
	Scanner sc = new Scanner(System.in);
	int i;
			System.out.println("Enter number to check whether its odd or even");
	  i = sc.nextInt();
		if(i % 2==0)
	
	
		System.out.println(i + " is an even number");
	
		else
	{
		System.out.println(i + " is an odd number");
	}
  }
}