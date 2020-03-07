package reviewSessions.week09_StringManipulation;

import java.util.Scanner;

public class StringEquals {

	public static void main(String[] args) {


		String s1 = "Wellcome to java";
		String s2 = "Wellcome to java";
		String s3 = new String ("Wellcome to java");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println("***********");
		System.out.println(s1.contentEquals(s2));
		System.out.println(s1.contentEquals(s3));
		
		Scanner input = new Scanner (System.in);
		System.out.println("What is the capital? :");
		String capital = input.next();
				if (capital.equalsIgnoreCase("Ankara")){
					System.out.println("Correct");
				}else {
					System.out.println("wrong");
				}
	}

}
