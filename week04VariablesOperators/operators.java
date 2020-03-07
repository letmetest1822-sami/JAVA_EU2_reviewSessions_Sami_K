package reviewSessions.week04VariablesOperators;

public class operators {

	public static void main(String[] args) {


		int rate=5;
		int delta = 10;
		int res1=rate*rate+delta;
		
		System.out.println("Result = " + res1);
		
		System.out.println("----------");
		int salary= 1000;
		int bonus = 100;
		
		int total = 2 * (salary + bonus);
				
		System.out.println("Total = " + total);
		
		System.out.println("---------");
		
		double time = 4;
		double mass = 2;
		
		double res2 = 1 / (time + (3 * mass));
		
		System.out.println("Result 2 = " + res2);
		
		System.out.println("---------");
		
		double a = 9;
		double t = 2;
		double v = 3;
		
		double res3 = (a-7)/(t+(9*v));
		
		System.out.println("Result 3 = " + res3);
		 

	}

}
