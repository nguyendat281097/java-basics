package com.nvd.training.deepandshadowclone;

/*
 * For shadow copy, we just copy all values of an object to another object. 
 * If the root value changed then the reference value of shadow object copy also changed.
 * In the example, the address variable currently was linked to two objects are pm and shadowCopy, 
 * if address changed, the address variable on two objects also changed.
 *  */

public class ShadowCopy {
	public static void whenModifyingOriginalObject_ThenCopyShouldChange() {

		Address address = new Address("Downing St 10", "London", "England");
		User pm = new User("Prime", "Minister", address);
		User shallowCopy = new User(pm.getFirstName(), pm.getLastName(), pm.getAddress());

		address.setCountry("Great Britain");
		
		System.out.println(shallowCopy.getAddress().getCountry());
		System.out.println(pm.getAddress().getCountry());
	}

	public static void main(String[] args) {
		whenModifyingOriginalObject_ThenCopyShouldChange();
	}
}
