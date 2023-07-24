package Casting;

public class Eg1 {
	
	//Types Of Casting
	//1.Implicit Casting and 2.Explicit Casting
	//Implicit : Lower to Higher
	//Explicit : Higher to Lower
	
	//order: byte-short-int-long-float-double
	//					char

	public static void main(String[] args) {
		
		//Implicit Method
		
		byte b1 = 10;
		short s1 = b1;
		System.out.println(s1);
		
		int i1 = s1;
		long l1 = i1;
		float f1 = l1;
		double d1 = f1;
		
		System.out.println(i1);
		System.out.println(l1);
		System.out.println(f1);
		System.out.println(d1);

		char ch = 'A';
		int ii = ch;
		System.out.println(ii);
		
		long ll = ii;
		System.out.println(ll);
	}

}
