import java.util.Scanner;

public class ItemPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double discount, sellingPrice;

		Scanner s = new Scanner(System.in);

		System.out.println(" Enter the price : ");
		int mrp = s.nextInt();

		if (mrp < 0)
			System.out.println("Invalid Input");
		else {

			if (mrp <= 10000) {
				discount = 0.1;
			} else if (mrp <= 20000) {
				discount = 0.2;
			} else {
				discount = 0.25;
			}

			sellingPrice = mrp - (discount * 100);

			System.out.println(sellingPrice);
		}

	}

}
