package in.vikas;

import java.util.Scanner;

public class Scanner_Demo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number..");
		int i=sc.nextInt();
		
		System.out.println("Enter Scond number..");
		int j=sc.nextInt();
		
		System.out.println(i+j);
		
		sc.close();
	}
}
