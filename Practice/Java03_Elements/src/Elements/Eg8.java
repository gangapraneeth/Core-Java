package Elements;

public class Eg8 {

	public static void main(String[] args) {
		
		new Eg8();

	}

	//Static Block
	static{
		int a = 10;
		int b = 20;
		System.out.println(a+" "+b);
		System.out.println("Static Block");
		System.out.println("");
	}
	
	//Instance Block
	{
		int a = 10;
		int b = 20;
		System.out.println(a+b);
		System.out.println("Instance Block");
	}
	
	
}
