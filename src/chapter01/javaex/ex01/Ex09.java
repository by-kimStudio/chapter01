package chapter01.javaex.ex01;

public class Ex09 {
	
	public static void main(String[] aegs) {
		
		//대입연산자
		int a = 7;
		int b = 2;
		
		//산술연산자
		System.out.println(a+b);  //한번만 출력
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);	//나누기---몫
		System.out.println(a%b);	//나누기---나머지
		
		System.out.println("-------------------------------------------");
		
		//%연산자 자세히~~!!!
		System.out.println(7/2);
		System.out.println(7.0/2);
		System.out.println((double)7/2);
		System.out.println(7%2);
		
		/*
		int var01 + a+b;
		System.out.println(var01);  //여러번 출력시
		*/
		
		System.out.println("-------------------------------------------");
		
		//부호연산사
		int var = -3;
		int pVar = +var;		//+(-3)  --> -3
		int mVar = -var;		//-(-3)  --> +3
		System.out.println(pVar);
		System.out.println(mVar);
		
	}

}
