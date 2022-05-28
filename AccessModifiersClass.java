package com.vstl.accessModifiers;

import com.vstl.accessSpecifiers.AccessSpecifier;

public class AccessModifiersClass {

	public static void main (String[] args) {
		
		AccessSpecifier objacspfr = new AccessSpecifier();
		//objacspfr.privateverification(); // declared as default in package accessSpecifiers.
		System.out.println("Default method cannot be accessed outside of the package");
	
		}
	
}

