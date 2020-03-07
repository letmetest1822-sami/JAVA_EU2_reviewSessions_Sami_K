package reviewSessions.week07_loops_methods;

public class returnMethodPractice3 {

	public static void main(String[] args) {


		checkEligible(500);
		printDay(1);
		
		
		}
	public static void checkEligible(int creditScore) {
		
		if (creditScore<=640) {
			System.out.println("Congrat you are eligible");
		}else {
	System.out.println(" sorry. not eligible");
	}

}
	
	public static void printDay(int day) {
		switch(day) {
		case 1:
			System.out.println("Monday");
			break;
			default:
				System.out.println("Invalid day");
		}
	}
}
