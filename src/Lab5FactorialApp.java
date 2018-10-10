import java.util.Scanner;

public class Lab5FactorialApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long factorial = 1;
		String userContinue = "y";

		System.out.println("Welcome to the Factorial Calculator!");

		do {
		System.out.println("Enter an integer that's greater than 0 but less than 10: ");
		int userInput = sc.nextInt();

		int i = 1;
		
		
			
		while (i <= userInput) {
			factorial = factorial * i;
			i++;
		}
		
		System.out.println("The factorial of " + userInput + " is: " + factorial);
	
		
		System.out.println("Continue? (y/n)");
		userContinue = sc.next();
		
		}
		while( userContinue.equals("y") || userContinue.equals("Y"));
		
	
		System.out.println("Goodbye!");
		}
		
		}
