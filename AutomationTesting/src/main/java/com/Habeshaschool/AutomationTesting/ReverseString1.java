package com.Habeshaschool.AutomationTesting;

public class ReverseString1 {

	public static void main(String[] args) {
 String S = "Selenium";
 int ln = S.length();
 String rev ="  ";
 for(int i=ln-1; i>=0;i--) {
rev=rev +S.charAt(i);

	 }
System.out.println(rev);	}
}