package lab1;

public class Robert {
	
	 double calculatePV (double retiredReturn, int yearsRetired, 
			double monthlySSI, double requiredIncome) {
		
		double cashFlow = requiredIncome-monthlySSI;
		
		return cashFlow*(1-(1+ Math.pow(1+(retiredReturn/12), -(yearsRetired)*12)))/(retiredReturn/12);
	
	}
	 
	 double calculatePMT(){
		 
		 double pmt = 0.0;
		 return pmt;
	 }

}
