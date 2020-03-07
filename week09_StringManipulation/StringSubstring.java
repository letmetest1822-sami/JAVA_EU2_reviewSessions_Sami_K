package reviewSessions.week09_StringManipulation;

public class StringSubstring {

	public static void main(String[] args) {


		String str = "CodeJava";
		System.out.println(str.substring(5));
		
		System.out.println(str.substring(3, 6));
		
		String s = "Long Sentence";
		System.out.println(s.substring(2,7));

		System.out.println(s.substring(2,3));
		System.out.println(s.charAt(2));
		
		System.out.println(s.substring(0,4));
		
		String s1 = "The best Java core course in Europe is Cybertek. End of Story";
		String myTarget = "course";
		int c = s1.indexOf(myTarget);System.out.println(c);
		int d = myTarget.length();System.out.println(d);
		System.out.println(s1.substring(c, c+d));
	}

}
