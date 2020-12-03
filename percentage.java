import java.util.*;
public class percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		float total, average, percentage,totalmarks;
		
		System.out.println("Enter subject 1 marks");
		int sub1 =  sc.nextInt();
		System.out.println("Enter subject 2 marks");
		int sub2 = sc.nextInt();
		System.out.println("Enter subject 3 marks");
		int sub3 = sc.nextInt();
		
		total = sub1 + sub2 + sub3;
		totalmarks = 300;
		percentage = (total / totalmarks) * 100  ;
		System.out.println("The percentage is: " + percentage + "%");
		
		
		if( percentage >=70 )
			System.out.println("Grade A");
		else if (percentage >=50)
			System.out.println("Grade B");
		else
			System.out.println("Grade D");
	
		

	}

}