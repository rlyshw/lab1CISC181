package lab1;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	//my version differs
	//@SuppressWarnings("resource")
	public static void main(String args[]) throws IOException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String yearsToWork = in.nextLine();
		double annualReturn; 		
		do {
			System.out.println("Please enter your expected annual return as an integer: ");
			annualReturn = in.nextDouble();
			} while(annualReturn < 0 || annualReturn > 20);
		annualReturn = (annualReturn/100);
		String yearsRetired = in.nextLine();
		String requiredIncome = in.nextLine();
		String monthlySSI = in.nextLine();
	}

}
