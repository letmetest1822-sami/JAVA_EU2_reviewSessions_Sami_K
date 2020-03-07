package reviewSessions.week09_StringManipulation;

public class StingIndexOf {

	public static void main(String[] args) {


		String str = "Hello Ozzy. Wellcome to Cybertek.";
		System.out.println(str.indexOf("Cybertek"));
		
		System.out.println("\n***********");
		
		String word = "github";
		System.out.println(word.indexOf("g"));

		System.out.println(word.indexOf("th"));
		System.out.println(word.indexOf("h"));
		System.out.println(word.indexOf("tb"));
		
		
		System.out.println("\n***********");
		
		String tech = "java, c++, python, tomcat,+ aws";
		
		if ((tech.indexOf("c++"))!=-1) {
			System.out.println("there is c ++ in the string");
		}
		
		if (tech.contains("c++")) {
			System.out.println("there is c ++ in the string");
		}
		
		System.out.println("\n***********");
		
		int firstComma = tech.indexOf(",");
		System.out.println("first comma : " + firstComma);
		
		int lastComma = tech.lastIndexOf(",");
		System.out.println("last comma : " + lastComma);
		
		
		System.out.println("\n***********");
		
		int secondComma = tech.indexOf(",", 5);
		System.out.println(tech+"\nSecond comma : " + secondComma);
		
		int thirdComma = tech.indexOf(",", secondComma+1);
		System.out.println(tech+"\nThird comma : " + thirdComma);
		
	}

}
