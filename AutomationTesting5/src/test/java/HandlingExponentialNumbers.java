//Import the Scanner class
import java.util.Scanner;

public class HandlingExponentialNumbers {

	public static void main(String[] args) {
		// first Creating Scanner Object
		// and it reads inputs user Enters
		Scanner Scan = new Scanner(System.in);
	     System.out.print("Enter a value of Number: ");
		
		//this will take double number from the user input
		//from the console and assign in to number variable
	    double number=Scan.nextDouble();
		System.out.println("calculating Exponential of a number... ");
		
		double result= Math.exp(number);
		System.out.println("Exponential of "  + number + " is: +" +result );
		//printing the Exponential number on the console

	}

}
