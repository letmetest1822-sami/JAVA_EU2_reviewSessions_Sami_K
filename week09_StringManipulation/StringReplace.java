package reviewSessions.week09_StringManipulation;

public class StringReplace {

	public static void main(String[] args) {

		String words = "pascal, unix, python";
		System.out.println(words.replace("pascal", "java"));
		System.out.println(words);
		
		words = words.replace(",", " | ");
		System.out.println(words);
		
		
		String amazonResult = "iphone case (212,717 Results)";
		amazonResult = amazonResult.replace("iphone case, (", "");
		
		System.out.println(amazonResult);
		
		amazonResult = amazonResult.replace(",", "");

	}

}
