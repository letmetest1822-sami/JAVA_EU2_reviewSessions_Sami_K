package reviewSessions.week04VariablesOperators;

public class IncremetnDecrementOperators {

	public static void main(String[] args) {


		int x = 2;
		int y = x--;
		
		System.out.println(y);
		System.out.println(x);

		int x1 = 2;
		int y1 = ++x1;
		
		System.out.println(y1);
		System.out.println(x1);
		
		int x2 = 2;
		int y2 = --x2;
		
		System.out.println(y2);
		System.out.println(x2);
		
		int a = 5;
		int b = a-- + ++a + ++a - a--;
			
		System.out.println("a = " + a);
		
		System.out.println("b = " + b);
		
	}

}
