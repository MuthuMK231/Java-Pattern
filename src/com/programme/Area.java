package com.programme;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the value of a");
		a=scanner.nextInt();
		System.out.println("Enter the value of b");
		b=scanner.nextInt();
		System.out.println("Enter the value of c");
		c=scanner.nextInt();
		int perimeter=(a+b+c);
		System.out.println("Enter the perimeter of triangle with sides is"+perimeter);

	}

}
