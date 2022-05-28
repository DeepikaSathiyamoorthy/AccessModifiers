package com.vstl.accessSpecifiers;

public class AccessSpecifier {

	private int intotp = 2356; // Private variable
	String stringmessage = "check the balance"; // default variable
	protected double doublecash = 2000;
	public String stringexit = "Logout from the Application";
	
	
		@SuppressWarnings("unused")
		private void enabletransaction() { // private method()
		System.out.println("Transaction is successfull");
		
		System.out.println(intotp);
	}
	
	void privateverification() { //default method()
		
		System.out.println("Methods and Variables declared as private in AccessSpecifier class \n could not be accessed in TestClass");
		
		System.out.println("default method declared in Access class \n is accessed by TestClass");
		if(stringmessage!= null) {
			
		System.out.println(stringmessage);
	
		} 
	}
		protected void protectedverification() {
		
		System.out.println("INR 2000 is credited ");	
		
	}
		
	public void publicverification() {
		
		System.out.println("Transaction is Successfull");
	}
}



 
