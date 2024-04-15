package com.programme;

public class Praymid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=5;
int b=a;
for(int i=1;i<=a;i++) {
	for(int j=1;j<=b-1;j++) {
		System.out.print(" ");
	}
	for(int k=1;k<=2*i-1;k++) {
		System.out.print("*");
	}
	b--;
	System.out.println();
}

	}

}
