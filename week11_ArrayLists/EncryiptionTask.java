package reviewSessions.week11_ArrayLists;

public class EncryiptionTask {

	public static void main(String[] args) {
		/*
		 * //create a method that accepts a string and return encryted string
  String alphabet = “abcdefghijklmnopqrstuvwxyz “;
  String encrypted =“zyxwvutsrqponmlkjihgfedcba “;
   
  //java - qzez
		 */

		System.out.println(encyrpted("java"));
		
	}
	public static String encyrpted(String input) {
		String alphabet  = "abcdefghijklmnopqrstuvwxyz";
		String encrypted = "zyxwvutsrqponmlkjihgfedcb";
		String message = "";
		
		for (int i=0; i<input.length(); i++) {
			
			char getLetter = input.charAt(i);
			
			int index1 = alphabet.indexOf(getLetter);
			
			char createdLetter = encrypted.charAt(index1);
			message = message + createdLetter;
		}
		return message;
		
	}
}
