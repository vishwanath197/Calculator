package conditional_programs;

import java.util.Scanner;

public class AttendanceCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter total classes scheduled: ");
		int totalClasses = sc.nextInt();
		
		System.out.println("Enter classes attended: ");
		int classesAttended = sc.nextInt();
		
		double attendancePercentage = ((double) classesAttended / totalClasses) * 100;
		
		System.out.println("Attendance Percentage is: " + attendancePercentage);
		
		if(attendancePercentage >= 75)
			System.out.println("You can attend the exam");
		else
			System.out.println("You cannot attend the exam");
			
	}

}