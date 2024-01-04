package com.javaex.ex02;

public class Ex01 {

	
	public static void main(String[] args) {
		
		int i = 12345;					//변수는 항상 위에 다~ 써
		double d =3.14;
		char c = '한';
		String s = "한";
		String str = "안녕하세요";
		String name = "김복영";
		String hello = "굿모닝";
		
		
		System.out.println(i);  	//i에 담아서 출력
		System.out.println("12345");//12345 정해진 걸 한번만 출력
		
		
		System.out.println("안녕하세요~");	//문자열 그대로 출력
		System.out.println(str);		//str에 저장해서 출력
		
		
		System.out.print(name);			//커서 위치가 이름 바로 뒤
		System.out.println(str);		//커서 위치가 다음 줄
		
		System.out.print("반갑");
		System.out.println("습니다!");
		
		System.out.println("---------------------------------");
		
		System.out.println(hello+hello);	
		System.out.println(name+" "+hello+" "+hello);	//공백
		System.out.println(name+"님 "+hello+" "+hello);	
		System.out.println("제 이름은 " + name + " 입니다. ");
		
		System.out.println("---------------------------------");
		
		System.out.println(i+i);
		System.out.println(d+d);
		System.out.println(i+d);
		System.out.println(c+c);	//한글이 숫자로 연산됨
		System.out.println(s+s);	//문자로 만들면 됨
		
		System.out.println(name+i+d);
		System.out.println(i+d);
		
		//안녕"하"세요
		//System.out.println("안녕"하"세요");   //틀린 표현
		System.out.println("안녕\"하\"세요");
		
		//안녕\하\세요
		System.out.println("안녕\\하\\세요");
		
		System.out.println("안녕\t하\t세요");	//한 탭씩 띄어 쓰기
		System.out.println("안녕\n하세요"); 	//2줄로 나눠 쓰기 == println을 두 줄 써도 같아.
		
	}
}
