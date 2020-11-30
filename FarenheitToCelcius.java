import java.util.Scanner;

public class FtoC
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the temperature in Fahrenheit: ");

		double fahrenheit =  input.nextDouble();

	
		double celsius = (fahrenheit - 32) / 9 * 5;

		System.out.println("The temperature in Celsius is " + celsius);	
	}
}