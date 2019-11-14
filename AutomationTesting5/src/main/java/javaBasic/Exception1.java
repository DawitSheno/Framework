package javaBasic;

public class Exception1 {
	public static void main(String[]args) {
		
			int a =10;
			int b =0;
			try {
			int result;
			
			result= a/b;
			System.out.println(result);
		}catch(ArithmeticException e) {
			System.out.println("Divided By Zero Error");
			System.out.println(e.getStackTrace());
		}
		System.out.println("Hello Java");
			System.out.println("Hello Selenium");

	}
		
}