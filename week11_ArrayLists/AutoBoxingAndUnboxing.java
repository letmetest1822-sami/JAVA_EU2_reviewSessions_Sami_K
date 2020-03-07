package reviewSessions.week11_ArrayLists;

public class AutoBoxingAndUnboxing {

	public static void main(String[] args) {
		// AUTOBOXING : CONVERT PRIMITIVE > WRAPPER CLASS OBJECT
		
		Integer n1 = 1000;
		int n = 345;
		Integer n2 = n;
		
		//UNBOXING : CONVERY WRAPPER CLASS OBJECT > PRIMITIVE
		
		Integer n3 = Integer.valueOf(45676);
		int num1 = n3;
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(num1);
		

	}

}
