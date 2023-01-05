package com.nvd.training.designpatterns.exercises.telephone;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Telephone telephone = new Telephone();
		new FirstScreen(telephone);
		new SecondScreen(telephone);
		Scanner myObj = new Scanner(System.in);

		System.out.println("Enter number");
		String num;

		while (true) {
			num = String.valueOf(myObj.nextInt());
			if (num.equals("-1")) {
				break;
			}
			telephone.updateNumber(num);

		}

	}
}
