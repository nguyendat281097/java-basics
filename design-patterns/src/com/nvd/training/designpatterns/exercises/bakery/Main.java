package com.nvd.training.designpatterns.exercises.bakery;

import com.nvd.training.designpatterns.exercises.bakery.impl.Chocolate;
import com.nvd.training.designpatterns.exercises.bakery.impl.MultiLayered;
import com.nvd.training.designpatterns.exercises.bakery.impl.Sprinkles;
import com.nvd.training.designpatterns.exercises.bakery.impl.Strawberry;
import com.nvd.training.designpatterns.exercises.bakery.impl.Vanilla;
import com.nvd.training.designpatterns.exercises.bakery.impl.X;

public class Main {
	public static void main(String[] args) {
		ICake cake1 = new Chocolate();
		System.out.print(cake1.cost() + "\t");
		cake1.print();
		System.out.println();

		ICake cake2 = new X(new Vanilla(), "PLAIN");
		System.out.print(cake2.cost() + "\t");
		cake2.print();
		System.out.println();

		ICake cake3 = new X(new Sprinkles(new Vanilla()), "FANCY!");
		System.out.print(cake3.cost() + "\t");
		cake3.print();
		System.out.println();

		ICake cake4 = new MultiLayered(
				new X(new X(new Sprinkles(new Sprinkles(new Strawberry())), "One of"), "EVERYTHING"));
		System.out.print(cake4.cost() + "\t");
		cake4.print();
		System.out.println();
	}
}
