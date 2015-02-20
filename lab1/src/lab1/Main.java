package lab1;

import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);
	//We should pull the input lines out into their own methods.
	public static double getInput(String promptString){
		//Does the input stuff here, making it easier to get input values
		//All inputs should be doubles, since doubles cast to ints
		System.out.print(promptString);
		return in.nextDouble();
	}

	public static void main(String args[]){
		
		double yearsToWork = getInput("Please enter the number of years you will be working: ");
		System.out.println(yearsToWork);
		
		double yearsRetired = getInput("Please enter your expected number of years in retirement: ");
		System.out.println(yearsRetired);
		
		double workingReturn; 		
		double retiredReturn;

		do {
			System.out.print("Please enter your expected working annual return as an integer between 0 and 20(eg. 7): ");
			workingReturn = in.nextDouble();
		}
		while(workingReturn < 0 || workingReturn > 20);
		workingReturn /= 100;
		System.out.println(workingReturn);

		do {
			System.out.print("Please enter your expected retired annual return as an integer between 0 and 3(eg. 2): ");
			retiredReturn = in.nextDouble();
		} 
		while(retiredReturn< 0 || retiredReturn > 3);
		retiredReturn /= 100;
		System.out.println(retiredReturn);

		System.out.print("Please enter your required income during retirement as a dollar amount: ");
		double requiredIncome = in.nextDouble();
		System.out.println(requiredIncome);
		
		System.out.print("Please enter your monthly Social Security income during retirement as a dollar amount: ");
		double monthlySSI = in.nextDouble();
		System.out.println(monthlySSI);
		
		System.out.printf("The amount you need to save for retirement is $%.2f", 
				calculatePV(retiredReturn, yearsRetired, monthlySSI, requiredIncome));
		
		in.close();	
		
	}
	
	 private static double calculatePV (double retiredReturn, double yearsRetired, 
				double monthlySSI, double requiredIncome) {
			
			double cashFlow = requiredIncome-monthlySSI;
			
			return cashFlow*((1-(1+ Math.pow(1+(retiredReturn/12), -(yearsRetired)*12)))/(retiredReturn/12));
		
		}

}
