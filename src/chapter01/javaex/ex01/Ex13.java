package chapter01.javaex.ex01;

public class Ex13 {
	
	public static void main(String[] args) {
		
		//논리 연산자
		//&& and연산자
		System.out.println(true && true);  
		System.out.println(true && false);
		System.out.println(false && true);  
		System.out.println(false && false);  
		
		System.out.println("----------------------------------");
		
		//|| or연산자
		System.out.println(true || true);  
		System.out.println(true || false);
		System.out.println(false || true);  
		System.out.println(false || false);  
		
		System.out.println("----------------------------------");
		
		//! 부정연산자
		System.out.println(!true);  
		System.out.println(!false);
		
		System.out.println("----------------------------------");

		//응용
		int a = 5;
		int b = 7;
		
		System.out.println((a>b)&&(a<b));    //f&&t => false
		System.out.println((a>b)||(a<b));    //f||t => true
		System.out.println(!(a>b));    	     //f!t => true
		
		System.out.println("----------------------------------");
		
		System.out.println((a>b)&&(a<b)||(a<b));    //f&&t||t => true
		System.out.println((a>b)||(a<b)||(a<b));    //f||t||t => true
		
	}

}
