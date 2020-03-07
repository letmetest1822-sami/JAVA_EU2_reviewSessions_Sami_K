package reviewSessions.week04VariablesOperators;

public class MixIntegers {

	public static void main(String[] args) {


		byte b = 32;
		char c = 'z';
		short s = 256;
		int i = 10_000;
		float f = 3.5F;
		double d = 0.5;
		
		double v = (d*i) + (f * -b) - (c/s); // 
		
		System.out.println(v);
		short s1 = 10, s2 = 5;
		System.out.println(v);
		System.out.println(c/s);

	}

}
