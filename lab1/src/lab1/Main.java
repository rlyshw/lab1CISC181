package lab1;

import java.util.Scanner;

public class Main {

	public static void main(String args[]){

		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the number of years you will be working: \n");
		int yearsToWork = in.nextInt();
		
		System.out.println("Please enter your expected number of years in retirement: \n");
		int yearsRetired = in.nextInt();
		
		double workingReturn; 		
		double retiredReturn;

		do {
			System.out.println("Please enter your expected working annual return as an integer between 0 and 20: \n"
					+ "e.g. 7 ");
			workingReturn = in.nextDouble();
		}
		while(workingReturn < 0 || workingReturn > 20);
		workingReturn /= 100;

		do {
			System.out.println("Please enter your expected retired annual return as an integer between 0 and 3: \n"
					+ "e.g. 2");
			retiredReturn = in.nextDouble();
		} 
		while(retiredReturn< 0 || retiredReturn > 3);
		retiredReturn /= 100;

		System.out.println("Please enter your required income during retirement as a dollar amount: \n");
		double requiredIncome = in.nextDouble();
		
		System.out.println("Please enter your monthly Social Security income during retirement as a dollar amount: \n");
		double monthlySSI = in.nextDouble();
		
		System.out.printf("The amount you need to save for retirement is $%.2f", 
				calculatePV(retiredReturn, yearsRetired, monthlySSI, requiredIncome));
		
		in.close();	
		
	}
	
	 private static double calculatePV (double retiredReturn, int yearsRetired, 
				double monthlySSI, double requiredIncome) {
			
			double cashFlow = requiredIncome-monthlySSI;
			
			return cashFlow*(1-(1+ Math.pow(1+(retiredReturn/12), -(yearsRetired)*12)))/(retiredReturn/12);
		
		}

}
