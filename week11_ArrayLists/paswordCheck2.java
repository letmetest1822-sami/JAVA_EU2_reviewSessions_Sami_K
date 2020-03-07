package reviewSessions.week11_ArrayLists;

import java.util.Scanner;

public class paswordCheck2 {

	public static void main(String[] args) {
		
		passwordCheck();
		
	}
	public static void passwordCheck() {
		String pass = PassEnter();
		if (checkUpperLetter(pass) && checkLowerCase(pass) && checkSpecial(pass) && checkDigit(pass)) {
			
			System.out.println("Your Password is valid ");
			
		} else {
			System.out.println("Your is Invalid please try again");
			PassEnter();
		}
		
	}
	private static boolean checkDigit(String pass) {
		
		boolean result = false;
		
		for (int i=0; i<pass.length(); i++) {
			
			if (Character.isDigit(pass.charAt(i))) {
				
				result=true;
				break;
			}
			
		} return result;	
	}
	private static boolean checkSpecial(String pass) {
		
		boolean result = false;
		
		for (int i=0; i<pass.length(); i++) {
			
			if (!(Character.isLetterOrDigit(pass.charAt(i)) || Character.isSpaceChar(pass.charAt(i)))) {
				
				result=true;
				break;
			} 
		}return result;
	}
	
	public static boolean checkUpperLetter(String pass) {
		
		
		boolean result = false;	
		
		for (int i=0; i<pass.length(); i++) {
			
			if (Character.isUpperCase(pass.charAt(i))) {
				
				result=true;
				break;
			
			} else {
				
				System.out.println("Your password is Invalid");
				PassEnter();
			}		
			
		} return result;
	
	}
	public static boolean checkLowerCase (String pass) {
		
		boolean result = false;
		
		for (int i=0; i<pass.length(); i++) {
			
			if (Character.isLowerCase(pass.charAt(i))) {
				
				result=true;
				break;
			} 
			
		} return result;
	
	}
	public static String PassEnter() {
		
		String password = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your password");
		
		password = sc.next();
				
		while (password.length()<6) {
			
			System.out.println("Please re-enter your password");
								
			password = sc.next();
		
		}return password;
			
	}
	
}
