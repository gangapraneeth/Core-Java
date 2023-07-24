package Casting;

public class Eg2 {
	 

	public static void main(String[] args) {
		// Explicit Casting
		//Order: double-float-long-int-short-byte
		//						   char
		
		double d1 = (float)65;
		float f1 = (float)d1;
		System.out.println(f1);
		
		long l1 = (long)f1;
		int i1 = (int)l1;
		short s1 = (short)i1;
		byte b1 = (byte)s1;
		
		System.out.println(l1);
		System.out.println(i1);
		System.out.println(s1);
		System.out.println(b1);
		
		char ch = (char)b1;
		System.out.println(ch);

	}

}
