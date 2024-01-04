package chapter01.javaex.ex01;

public class Ex06 {
	
	public static void main(String[] args) {
		
		
		//일반적인 경우
		double pi = 3.14;
		
		double result = pi*5*5;
		
		System.out.println(result);
		
		//pi 값을 변경하는 경우
		pi = 3.141519;
		double circleArea = pi*5*5;
		
		System.out.println(circleArea);
		
		
		////////////////////////////////////////////////////////////
		
		//final 쓰면 못바꾸게 정해
		final double pi2 = 3.14;   //상수로 정의할 땐, 대문자로~
		double result02 = pi2*5*5;
		System.out.println(result02);
		
		/////pi2 = 3.141519;//바꾸려는 시도도 안됨  //상수값을 변경하려고 할 때 오류 확인
		
		double circleArea2 = pi2*5*5;
		System.out.println(circleArea2);
		
		/*
		 * final double PI = 3.14;   //상수로 정의할 땐, 대문자로~
		double result02 = PI*5*5;
		System.out.println(result02);
		
		//PI = 3.141519;//바꾸려는 시도도 안됨  //상수값을 변경하려고 할 때 오류 확인
		
		double circleArea2 = PI*5*5;
		System.out.println(circleArea2);
		 */
		
	}
	

}
