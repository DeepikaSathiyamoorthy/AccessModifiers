package com.vstl.accessSpecifiers;

public class TestAccessSpecifier {

	public static void main(String[] args) {
		AccessSpecifier objaccessspecifier = new AccessSpecifier();
		/*System.out.println(objaccessspecifier.intotp);// shows an error as change the visibility
			objaccessspecifier.enabletransaction(); // shows an error as change the visibility */
	
	objaccessspecifier.privateverification(); // default method declared in Access class is accessed by TestClass
	
	objaccessspecifier.protectedverification(); //protected method calling within the package
	
	objaccessspecifier.publicverification(); // public method
	System.out.println(objaccessspecifier.stringexit);
	}
}
