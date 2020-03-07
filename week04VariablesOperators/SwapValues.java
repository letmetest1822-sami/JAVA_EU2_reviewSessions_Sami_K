package reviewSessions.week04VariablesOperators;

public class SwapValues {

	public static void main(String[] args) {


		int n1 = 10;
		int n2 = 20;
		
		/*int n3 = 0;
		n3 = n1; // n1= 10 n2 = 20 n3 = 10
		n1 = n2; // n1= 20 n2 = 10 n3 = 10
		n2 = n3; // n1= 10 n2 = 10 n3 = 10*/
		
		//option 2 by using arithmetic calculation
		
		n2 = n1 + n2;  // n1= 10 n2 = 30
		n1 = n2 - n1;  // n1= 20 n2 = 30
		n2 = n2 - n1;  // n1= 20 n2 = 10
		
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
		
		

	}

}
