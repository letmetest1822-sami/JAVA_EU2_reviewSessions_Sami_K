package reviewSessions.week10_Arrays;

import java.util.Scanner;

public class ArrayWithScanner {

	public static void main(String[] args) {


		Scanner input = new Scanner (System.in);

		int [] scores = new int [5];
		
		for (int i=0; i<5; i++) {
			System.out.print("Enter score " + (i+1) + " : ");
			scores [i] = input.nextInt();
			
		}
		
		//print all score in one line 
		for(int score : scores) {
			System.out.print(score + " ");
		}
		//print max, largest
		System.out.println();
		
		int max = 0;
		int min = scores[0];
		int sum = 0;
		for(int i = 0;  i<scores.length;   i++) {
			sum = sum + scores[i];
			if (scores[i]>max) {
				max = scores [i];
			}if (scores[i]<min) {
				min= scores [i];
			}
		}
		System.out.println("\nThe  greatest   number  is   : " + max);
		System.out.println("The  smallest   number  is   : " + min);
		System.out.println("The sum of all  scores  is   : " + sum);
		System.out.println("The average of all scores is : " + sum/5);
	}

}
