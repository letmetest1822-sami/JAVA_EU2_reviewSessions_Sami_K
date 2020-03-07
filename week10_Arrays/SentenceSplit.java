package reviewSessions.week10_Arrays;

import java.util.Arrays;

public class SentenceSplit {

	c

		String sentence = "java is fun";

		//find out how many words in the sentence
		
		String[] words = sentence.split(" ");
		
		System.out.println(Arrays.toString(words));
		
		System.out.println(words.length);
		
		for (String str : words) {
			System.out.print(str + "  ");
		}
		System.out.println();
		String[] words2 = words[0].split("a");
		System.out.println(Arrays.toString(words2));
		
		
	}

}
