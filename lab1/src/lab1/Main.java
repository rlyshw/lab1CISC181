package lab1;

import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);
	//We should pull the input lines out into their own methods.
	
	private static double getInput(String promptString){
		//Does the input stuff here, making it easier to get input values
		//All inputs should be doubles, since doubles cast to ints
		// ^ True that -RW
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
		
		in.close();	// closes the scanner
		
		// "Present Value", AKA amount needed for retirement
		double pv = calculatePV(retiredReturn, yearsRetired, monthlySSI, requiredIncome);
		
		System.out.printf("\nThe amount you need to save for retirement is $%.2f. \n"
				+ "To get this amount, you must save $%.2f each month. ", 
				pv, calculatePMT(pv, workingReturn, yearsToWork));
				
	}
	
	/**
	 * Calculates the present Value of an investment. 
	 * In this case, it calculates the money needed for retirement 
	 * with the given conditions.
	 * 
	 * @param retiredReturn
	 * @param yearsRetired
	 * @param monthlySSI
	 * @param requiredIncome
	 * @return Money needed for retirement
	 */	
	 private static double calculatePV (double retiredReturn, double yearsRetired, 
				double monthlySSI, double requiredIncome) {
			
			double cashFlow = requiredIncome-monthlySSI;
			
			return (cashFlow)*((1-(Math.pow((1+(retiredReturn/12)),(-yearsRetired*12))))/(retiredReturn/12));			
		}
	 /**
	  * Given the amount needed for retirement (pv), 
	  * calculates the amount needed to be saved each month.
	  * 
	  * @param pv
	  * @param workingReturn
	  * @param yearsWorking
	  * @return monthly amount needed to be saved
	  */
	 private static double calculatePMT(double pv, double workingReturn, double yearsWorking) {
	
		 return (-pv)*((workingReturn/12)/(1-(Math.pow((1+(workingReturn/12)), ((yearsWorking*12))))));
	 }

}
