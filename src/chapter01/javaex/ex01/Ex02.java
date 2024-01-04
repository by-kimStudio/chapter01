package chapter01.javaex.ex01;

public class Ex02 {
	
	public static void main(String[] args) {
		
		//byte
		byte no = 127;
		
		//no = -129;   //byte형의 범위를 벗어남
		//no = 127;
		
		System.out.println(no);
		
		//////////////////////////////////////////////
		
		
		//int
		int num = 2147483647;
				
		System.out.print(num);
		
		
		
		//long
		//int의 범위를 벗어난 숫자는 맨뒤에 L을 붙여야 한다.-구분 힘들면 무조건 붙여.
		long num2 = -9223372036854775808l;
		
		System.out.print(num2);
		
		
		
		
		/////////////////////////////////////////////
		//변수선언, 초기화
		/*int var01;
		int var02;
		int var03;*/
		int var01, var02, var03;
		
		
		//초기화 대입
		var01 = 10;
		var02 = 20;
		var03 = 30;

		System.out.println(var01);
		System.out.println(var02);
		System.out.println(var03);
		
		
		/////////////////////////////////////////////
		int var04 = 100 ;
		int var05 = 200	;	
		int var06 = 300	;	
		//int var04 = 100, var05 = 200, var06 = 300;
		
		System.out.println(var04);
		System.out.println(var05);
		System.out.println(var06);
		//System.out.println();  //sysout+ctrl+space bar 자동완성
		
	}

}
