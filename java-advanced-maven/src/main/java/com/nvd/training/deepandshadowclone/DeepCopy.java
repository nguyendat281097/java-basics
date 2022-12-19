package com.nvd.training.deepandshadowclone;

/* 
 * For deep copy, when copying an object to another object, 
 * we create a new object variable and pass all values of the old object to the new object.
 * For example, add a new constructor method in the User class to new a object of Address. 
 * When we create deepcopy, we pass all values of address in pm to new address in deepcoy.
 * So the address parameter in deepcopy does not link to address in pm, 
 * and when we change pm.address, deepcopy.address does not change.
 * 
 */
public class DeepCopy {
	public static void whenModifyingOriginalObject_thenCopyShouldNotChange() {
	    Address address = new Address("Downing St 10", "London", "England");
	    User pm = new User("Prime", "Minister", address);
	    User deepCopy = new User(pm);
	 
	    address.setCountry("Great Britain");
	    System.out.println(pm.getAddress().getCountry());
	    System.out.println(deepCopy.getAddress().getCountry());
	}
	public static void main(String[] args) {
		whenModifyingOriginalObject_thenCopyShouldNotChange();
	}
}
