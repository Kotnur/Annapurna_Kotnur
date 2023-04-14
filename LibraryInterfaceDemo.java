package abstraction;

public interface LibraryInterface {
	public void registerAccount();
	public void requestBook();

}
class KidUsers implements LibraryInterface{
	int age;
	String bookType;
	public KidUsers(int age, String bookType) {
		super();
		this.age=age;
		this.bookType= bookType;
	}
	public void registerAccount() {
		if(age<12) {
			System.out.println("You hava successffully registered under a Kids Account");
		}
		else {
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
	}
	public void requestBook() {
		if(bookType== "kids") {
			System.out.println("Book issued successfully please return the book within 10 days");
		}
		else {
			System.out.println("Oops, you are allowed to take only kids book");
		}
	}
	
}
class AdultUser implements LibraryInterface{
	int age;
	String bookType;
	
	public AdultUser(int age, String bookType) {
		super();
		this.age= age;
		this.bookType= bookType;
	}
	public void registerAccount() {
		if(age>12) {
			System.out.println("You have successfully registered under an Adult Account.");
			
		}
		else {
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
			}
	}
	public void requestBook() {
		if(bookType=="Fiction") {
			System.out.println("Book Issued successfully please return the book within 7 days");
			
		}
		else {
			System.out.println("Oops, you are allowed to take only adult Fiction books.");
		}
	}
	
}

public class LibraryInterfaceDemo{
	public static void main(String[] args) {
		KidUsers A= new KidUsers(9, "kids");
		System.out.println("Age: "+ A.age);
		System.out.println("Book Type: "+ A.bookType);
		A.registerAccount();
		A.requestBook();
		
		System.out.println();
		
		KidUsers B = new KidUsers(15,"fiction");
		System.out.println("Age"+ B.age);
		System.out.println("Book Type:"+ B.bookType);
		B.registerAccount();
		B.requestBook();
		System.out.println();
		
		AdultUser C = new AdultUser(15, "Fiction");
		System.out.println("Age: "+ C.age);
		System.out.println("Book Type:"+ C.bookType);
		C.registerAccount();
		C.requestBook();
		System.out.println();
		
		AdultUser D = new AdultUser(5,"Kids");
		System.out.println("Age: "+D.age);
		System.out.println("Book Type:"+D.bookType);
		D.registerAccount();
		D.requestBook();
		System.out.println();
	}
	
}
