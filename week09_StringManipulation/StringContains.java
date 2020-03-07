package reviewSessions.week09_StringManipulation;

public class StringContains {

	public static void main(String[] args) {


		String str = "amazon  website";
		System.out.println(str.contains("Amazon"));

		if (str.contains("zon")) {
			System.out.println("There is zon in the string");
			
		}else {
			System.out.println("there is no zon");
	
		}
	
	System.out.println("**********\n");
	
	String email = "employeee@yahoo.com";
	
		if (email.contains("@yahoo")) {
			System.out.println("This is a yahoo email account");
		}
		
		System.out.println("**********\n");
		
		//title checking
		//first navigate the web page
		
		String title = "Porche HOME - Proche USA";
		
		if(title.contains("Porche")) {
			System.out.println("Test case passed. Correct title.");
		}
		else {
			System.out.println("Test case failed. Wrong title.");
		}
		
		
		
		
	}
}
	


