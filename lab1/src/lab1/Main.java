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
		double workingReturn; 		
		do {
			System.out.println("Please enter your expected working return as an integer between 0 and 20: \n"
					+ "e.g. 7 ");
			workingReturn = in.nextDouble();
			} while(workingReturn < 0 || workingReturn > 20);
		workingReturn /= 100;
		double retiredReturn;
		do {
			System.out.println("Please enter your expected retired return as an integer between 0 and 3: \n"
					+ "e.g. 2");
			retiredReturn = in.nextDouble();
		} while(retiredReturn< 0 || retiredReturn > 3);
		retiredReturn /= 100;
		}
		String requiredIncome = in.nextLine();
		String monthlySSI = in.nextLine();
	}

}
