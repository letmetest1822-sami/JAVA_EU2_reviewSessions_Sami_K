package reviewSessions.week11_ArrayLists;

public class wrapperClasses {

	public static void main(String[] args) {


		Boolean b1 = new Boolean  (true);
		//Boolean b2 = Boolean valueOf(true);
		Boolean b3 = Boolean.valueOf("true");
		
		Character c1 = new Character ('a');
		//Character c2 = Character.valueOf(valueOf('a'));
		
		Integer i1 = new Integer (100);
		Integer i2 = Integer.valueOf("1000");
		Integer i3 = Integer.valueOf(1000);
		
		Integer num = new Integer (10);
		
		System.out.println(num);
		
		String strNum = num.toString()
		
		
		/*
		 * first larger than second -> 1
		 * equals     0
		 * first is less than second 2
		 */

		System.out.println(Integer.compare(10,	5));
	}

}
