package reviewSessions.week09_StringManipulation;

public class StringSubString_ChooseWord {

	public static void main(String[] args) {
		
		String s1 = "The best Java core course in Europe is Cybertek. End of Story";
		String myTarget = "course";
		
		int c = s1.indexOf(myTarget);
		//System.out.println(c);
		
		int d = myTarget.length();
		//System.out.println(d);
		
		System.out.println(s1.substring(c, c+d));

	}

}
