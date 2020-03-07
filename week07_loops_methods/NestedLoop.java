package reviewSessions.week07_loops_methods;

public class NestedLoop {

	public static void main(String[] args) {

		for (int outer = 1 ; outer<=4; outer++) {
			
			System.out.println("Outer: " + outer );
			
			for(int inner = 1; inner <=9; inner++) {
				
				System.out.print(inner + " ");
			}
			System.out.println();
		}

	}

}
