package reviewSessions.week09_StringManipulation;

public class StringLegth {

	public static void main(String[] args) {
		String name = "Mike Smith";
		System.out.println(name.length());
		int length = name .length();
		
		String str = "";
		System.out.println(str.length());
		String password = "cybertek123";
		if (password.length()<=8) {
			System.out.println("Password length matches the requirement");
		}else {
			System.out.println("Password is shorter than needed");
		}

	}

}
