package reviewSessions.week11_ArrayLists;

public class votingCheck {

	public static void main(String[] args) {

	voteCheck(1978);
	}
	
	public static void voteCheck(int birthyear) {
		
		if (printAge(birthyear) >= 18) {
			
			System.out.println("Eligible to vote...");
		}
		else {
			
			System.out.println("Not eligible to vote...");
		}	
	}
	
	public static int printAge(int birthYear) {
		
		int age = 2020 - birthYear;
		
		return age;
	}
}
