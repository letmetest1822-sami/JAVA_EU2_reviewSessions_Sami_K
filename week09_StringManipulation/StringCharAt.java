package reviewSessions.week09_StringManipulation;

public class StringCharAt {

	public static void main(String[] args) {
		String company = "Cybertek";
		/*
		System.out.println(company.length());
		System.out.println(company.charAt(0));
		System.out.println(company.charAt(4));
		
		System.out.println(company.charAt(7));
		*/
		int k=(company.length()-1);
		
		for (int j=k;     j>=0;     j--) {
			if(j==0) {
				System.out.print(company.charAt(j) + " ");
			}else {
				System.out.println(company.charAt(j));
				  }
			}
		
		for (int i=1; i<=company.length()-1; i++) {
			System.out.print(company.charAt(i) + " ");
		}
	}

}
