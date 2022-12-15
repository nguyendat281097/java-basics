package com.nvd.java8.defaultmethod.muti_inher;

/*
 * When an abstract class with the method has the same name an interface with
 * default method. A subclass extends abstract class and implements interface
 * will skip the default method in interface and execute the method in abstract
 * class
 */
public class Subclass2 extends AbstractClass implements Interface1 {

	public static void main(String[] args) {
		Subclass2 m = new Subclass2();
		m.defaultMethod(); // Execute in AbstractClass
	}
}
