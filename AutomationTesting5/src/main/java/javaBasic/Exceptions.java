package javaBasic;

import net.bytebuddy.jar.asm.commons.TryCatchBlockSorter;

public class Exceptions {
	
	

		
		public static void main(String[] args) {
			
			try {
			System.out.println("Hello Selenium");
			int i = 8/0;
			System.out.println("Test is Completed");
		}
		
	catch (Exception Exp ) {
		System.out.println(Exp);
		Exp.printStackTrace();
	}
			finally {
				System.out.println("Regardless this code will print/run");
				
			}
	
	}
	}
	



