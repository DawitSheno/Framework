package com.Habeshaschool.AutomationTesting;

import java.nio.IntBuffer;
import java.util.Scanner;

public class ReversingName2 {

	public static void main(String[] args) {

		
		Scanner SC = new Scanner(System.in);
		StringBuffer Br = new StringBuffer(SC.nextLine());
		System.out.println((Br).reverse());
		SC.close();
	}

}
