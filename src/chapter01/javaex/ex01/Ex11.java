package chapter01.javaex.ex01;

public class Ex11 {
	
	public static void main(String[] args) {
		
		int b = 10;
		
		System.out.println(b);
		System.out.println(b++);	//++을 뒤에 넣으니, b가 출력이 된 다음에 메모리를 바꾼다.
		System.out.println(b);		//메모리 바뀐 값 확인
		System.out.println(b--);
		System.out.println(b);
		
		System.out.println("------------------------------");
		
		int no = 10;
		
		System.out.println(++no + 3);
		System.out.println(no);
		System.out.println(no-- + 3);
		System.out.println(no);
		
		++no;			//출력은 안해도 증가시킨거야~
		++no;
		System.out.println(no);
		
	}

}
