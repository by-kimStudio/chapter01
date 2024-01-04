package chapter01.javaex.ex01;

public class Ex10 {
	
	public static void main(String[] args) {
		
		//증가 연산자
		int a = 7;  //int = a; //a = 7; ---두 줄 표현을 한줄로 한거야~
		
		System.out.println(a);
		System.out.println(++a);	//메모리 값을 바꾸네?
		System.out.println(a);		//메로리 값이 8로 증가했어
		System.out.println(++a);	//또 증가했어!
		
		System.out.println("--------------------------");
		
		//감소 연산자
		int b = 7; 
		
		System.out.println(b);
		System.out.println(--b);	//메모리 값을 바꾸네?
		System.out.println(b);		//메로리 값이 6으로 감소했어
		System.out.println(--b);	//또 감소했어!
		
	}

}
