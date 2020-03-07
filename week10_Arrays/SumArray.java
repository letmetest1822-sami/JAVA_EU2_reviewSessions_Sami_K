package reviewSessions.week10_Arrays;

public class SumArray {

	public static void main(String[] args) {

	
	
	//loop thru each item and if you find price more than 100,
	//print "item is too expensive, you dont need it"
	//exit the loop
		
		double [] prices= {19.99,23.5,9.99,5.99,102.5};

		for (double price : prices) {
			if(price>100) {
				System.out.print(" item is too expensive, you dont need it  ");
				
				break;
			}
			
			

	}

}
