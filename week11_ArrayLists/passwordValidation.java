package reviewSessions.week11_ArrayLists;

import java.util.Scanner;

public class passwordValidation {

public static void main(String[] args) {
		/*
		 * Write a return method that can verify if a password is valid or not.
	requirements:
	1. Password MUST be at least have 6 characters and should not contain space
	2. PassWord should at least contain one upper case letter
	3. PassWord should at least contain one lowercase letter
	4. Password should at least contain one special characters
	5. Password should at least contain a digit
	if all requirements above are met, the method returns true, otherwise returns false

		 */

		Scanner input = new Scanner (System.in);
			System.out.println("Please enter a password : ");
			String pass = input.nextLine(); 
			
			passwordValid(pass);
	}

	public static void passwordValid(String pass) {
		
		if (len(pass) && upper(pass) && lower(pass) && digit(pass) && specialCharacter(pass) ) {
			
			System.out.println("Password is valid");
		}
		else {
			System.out.println("Password is not valid");
		}
	}
	
	public static boolean len(String pass) {
		
		boolean len = false;
		
		if (pass.length() >= 6) {
			len = true;
		}
		return len;
	}
	
	public static boolean upper(String pass){
		
		boolean upper = false;
		
		for (int i = 0;    i< pass.length();    i++) {
			
			if(Character.isUpperCase(pass.charAt(i))){
				upper = true;
				break;
			}
		}
		return upper;
	} 
	
	public static boolean lower (String pass){
		
		boolean lower = false;
		
		for (int i = 0;     i< pass.length();    i++) {
			
			if(Character.isLowerCase(pass.charAt(i))){
				lower = true;
				break;
			}
		}
		return lower;
}
public static boolean digit (String pass){
		
		boolean digit = false;
		
		for (int i = 0;     i< pass.length();    i++) {
			
			if(Character.isDigit(pass.charAt(i))){
				digit = true;
				break;
			}
		}
		return digit;
}
	public static boolean specialCharacter(String pass) {
		
		boolean specialCharacter = false;
		
		for (int i = 0;    i< pass.length();     i++) {
			if((!Character.isLetterOrDigit(pass.charAt(i))) && (!Character.isSpaceChar(pass.charAt(i)))){
				specialCharacter = true;
				break;
			}
		}
		return specialCharacter;
		
	}
}
