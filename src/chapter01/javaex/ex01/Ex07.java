package chapter01.javaex.ex01;

public class Ex07 {
	
	public static void main(String[] args) {
		
		//////////////////////////////////////
		
		int var00 =3+5;
		System.out.println(var00);
		
		double var02 = 3+3+5;
		System.out.println(var02);
		
		/////////////////////////////////////////
		//자동형변환
		int a = 3;  //3.0으로 자동 형변환됨
		double b =3.5;
		double var03 = a+b;
		System.out.println(var03);
		
		//////////////////////////////jhfjfhfj
		//강제형변환
		float var04 = 1111.6345F;
		int var05 = (int)var04;  //소수점 버려도 되니까 정수로 바꿔줘
		System.out.println(var04);
		System.out.println(var05);
		
		///////////////////////////////
		//정수 안에서 형변환
		byte bValue = 10;
		int iValue =(int)bValue;
		System.out.println(iValue);
		
		//축소 정상변환 
		int aValue = 10;
		byte cValue = (byte)aValue;
		System.out.println(cValue);
		
		//축소 비정상변환
		int dValue = 103029770;
		byte eValue = (byte)dValue;
		System.out.println(eValue);
		
		//실수 ---> 정수
		double v07 = 5.57;
		int v08 = (int)v07;
		System.out.println(v08);
		
		//정수 ---> 실수
		int v09 = 7;
		double v10 = (double)v09;
		System.out.println(v10);
	
	}

}
