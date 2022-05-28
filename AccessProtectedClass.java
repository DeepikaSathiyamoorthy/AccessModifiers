package com.vstl.accessModifiers;

import com.vstl.accessSpecifiers.AccessSpecifier;

public class AccessProtectedClass extends AccessSpecifier { //extends the class to access protected method and variable from class AccessSpecifiers
	
	public static void main(String[] args) {
		
		AccessProtectedClass objprotected = new AccessProtectedClass();
		objprotected.protectedverification();
		double intgetcash = objprotected.doublecash; //
		System.out.println("Get cash" +intgetcash);
	}

}
