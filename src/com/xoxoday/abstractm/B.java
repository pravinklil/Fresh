package com.xoxoday.abstractm;

import java.util.Scanner;

public class B extends Maths {
	
	double Input1; double Input2; double finalResult;

	@Override
	public
	void add() {
		System.out.println("Enter the First Input");
		Scanner sc = new Scanner(System.in);
		Input1 = sc.nextDouble();	
		System.out.println();
		System.out.println("Enter the Second Input");
		Scanner sc1 = new Scanner(System.in);
		Input2 = sc1.nextDouble();
		
		
		

	}


	@Override
	public
	void output() {
		System.out.println("Addition     "+ (Input1 + Input2) );

		System.out.println("Multiplication    "+ Input1 * Input2);
		
	}

}
