import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x = 9;
		do {
			
			System.out.println("Welcome to the Employee Payement Screen" + "\n" + "\n" + 
			"What is the first name of the paid advisor?");
			String first = scan.next();
			
			System.out.println("\n" + "What is the last name of the paid advisor?");
			String last = scan.next();
			
			System.out.println("\n" + "What is the regular pay rate for this person?");
			double regularPayRate = scan.nextDouble();
			
			System.out.println("\n" + "What is the overtime pay rate for this person?)");
			double overtimePayRate = scan.nextDouble();
			
			System.out.println("\n" + "What is the special pay rate for this person?");
			double specialPayRate = scan.nextDouble();
			
			System.out.println("\n" + "How many hours did this person work total?");
			int hoursWorked = scan.nextInt();
			
			
			System.out.println("\n" + "How many special hours did this person work total?");
			int hoursSpecial = scan.nextInt();
		
			PaidAdvisor a = new PaidAdvisor(first, last, regularPayRate, specialPayRate, overtimePayRate, hoursWorked, hoursSpecial);
	
			System.out.println("Name: " + a.getFirstName() + " " + a.getLastName() + "\n" +
					"Hours Worked: " + a.getHoursWorked() + "\n" +
					"Pay Rate: " + a.getPayRate() + "\n" +
					"Special Pay: " + (a.getSpecialHoursWorked() * a.getSpecialPayRate()) + "\n" +
					a.toString());
			
			System.out.println("\n" + "Would you like to add another paid advisor? (Type 1 for YES or 0 for NO)");
			x = scan.nextInt();
		}
		while (x != 0);
		
		System.out.println("Thank you for using the Employee Payment Screen.");
		
	}

}