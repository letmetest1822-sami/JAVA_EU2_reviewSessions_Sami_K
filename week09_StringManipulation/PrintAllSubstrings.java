package reviewSessions.week09_StringManipulation;

public class PrintAllSubstrings {

	public static void main(String[] args) {
		String s2= "Cybertek";
		int n = s2.length();
		int k=0;
		for(int i=0; i<=n; i++) {
			for (int j=i;j<=n;j++) {
				System.out.println(s2.substring(i, j));
				k++;
			}
		}System.out.println("There are " + k + " substrings...");

	}

}
