package com.nvd.java8.defaultmethod.muti_inher;

/*
 * Exception when implementing two interfaces with the same default method name.
 * 
 * Duplicate default methods named defaultMethod with the parameters () and ()
 * are inherited from the types Interface2 and Interface1
 * 
 * How can we resolve it? Use super keyword and override default method.
 * 
 */
public class Subclass implements Interface1, Interface2 {

	@Override
	public void defaultMethod() {
		Interface2.super.defaultMethod();
	}

	public static void main(String[] args) {
		Subclass subclass = new Subclass();
		subclass.defaultMethod();
	}
}
