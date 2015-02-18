package lab1;
import java.util.Scanner;


public class Tommy {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the amount of years you plan to work: ");
		int numYears = input.nextInt();
		double annualReturn; 		
		do {
			System.out.println("Please enter your expected annual return: ");
			annualReturn = input.nextDouble();
			} while(annualReturn < 0 || annualReturn > 20);
		annualReturn = (annualReturn/100);
			
			
	
		
		System.out.println("The next questions will prompt you to input values for ");
		System.out.println("Please enter the number of years retired: ");
		int yearsRetired = input.nextInt();
		
		System.out.println("Please enter your annual reurn, the value must be between 0% and 3%: ");
		
		
	}

}
