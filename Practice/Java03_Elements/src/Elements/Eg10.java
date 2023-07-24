package Elements;

public class Eg10 {
	
	//Customer
	
	//Instance Method With Args
	public void bankCustomers(String firstName, String lastName, String email, long ContactNo) {
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(email);
		System.out.println(ContactNo);
	}
	
	//Static Method with args
	public static void bankName(String bankName, String bankIFSC, String bankAddress) {
		System.out.println(bankName);
		System.out.println(bankIFSC);
		System.out.println(bankAddress);
		System.out.println();
	}

	public static void main(String[] args) {
		Eg10 customer1 = new Eg10();
		customer1.bankCustomers("Ganga", "Praneeth", "ganapraneeth@gmail.com", 9160443328L);
		bankName("ICICI", "ICIC000111", "Hyderabad");
		
		Eg10 customer2 = new Eg10();
		customer2.bankCustomers("Navya", "Sree", "navyasree@gmail.com", 9160443328L);
		bankName("ICICI", "ICIC000111", "Hyderabad");
		
		Eg10 customer3 = new Eg10();
		customer3.bankCustomers("Nithin", "Krishna", "nithinkrishna@gmail.com", 9160443328L);
		bankName("ICICI", "ICIC000111", "Hyderabad");

	}

}
