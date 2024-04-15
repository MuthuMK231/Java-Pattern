package com.programme;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=12345;
int b=0;
int i=a;
while(a>0) {
	int r=a%10;
	b=(b*10)+r;
	a=a/10;
	System.out.print(a);
	
}
	}

}
