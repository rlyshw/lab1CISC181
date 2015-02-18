package lab1;
import java.util.Scanner;


public class Tommy {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the amount of years you plan to work: ");
		int numYears = input.nextInt();
		System.out.println("Please enter the expected annual return on your investment as a percentage: ");
		System.out.println("The value should be between 0-20%");
		double annualReturn = input.nextDouble();
		if(annualReturn < 0 || annualReturn >20){
			System.out.println("Your number is either larger than 20 or negative, please try again: ");
			System.out.println("Please enter your annual return as a percentage between 0% and 20%: ");
			double annualReturn = input.nextDouble();
		}
		annualReturn = (annualReturn/100)+annualReturn;
		
		System.out.println("The next questions will prompt you to input values for ")
		System.out.println("Please enter the number of years retired: ");
		int yearsRetired = input.nextInt();
		
		System.out.println("Please enter your annual reurn, the value must be between 0% and 3%: ");
		
		
	}

}
