package org.hcl;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		String original, reverse ="";
		Scanner sc = new Scanner(System.in);
		System.out.println("enteer the string ");
		
		original= sc.nextLine();
	for(int i = original.length()-1;i>=0;i--) {
		reverse = reverse+original.charAt(i);
	}
	System.out.println(reverse);
	}
	}


