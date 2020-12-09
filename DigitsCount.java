import java.util.Scanner;

public class DigitsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int num = sc.nextInt();

		System.out.println("Number of Digits " + countDigits(num));
	}

	public static int countDigits(int n) {
		int count = 0;

		while (n != 0) {
			n = n / 10;
			count++;
		}

		return count++;

	}

}
