package chapter01.javaex.ex01;

public class Ex08 {
	
	public static void main(String[] args) {
		
	double v01 = 5/4;		//정수값으로 줘서 정수값으로 끝나 double형태라서 소수점까지 나타냄
	System.out.println(v01);
	
	double v02 = (double)5/4;	//5.0/4---5.0/4.0 으로 계산(강제형변형)
	System.out.println(v02);
	
	double v03 = 5/(double)4;	//5/4.0---5.0/4.0 으로 계산(강제형변형)
	System.out.println(v03);
	
	double v04 = (double)5/(double)4;	//5.0/4.0 계산
	System.out.println(v04);
	
	int v99 = (int)(5/(double)4);	//(int)로 표현하고 싶을 때, 억지로;;;
	System.out.println(v99);
	
	int v05 = (int)1.3 + (int)1.8;		//정수만 +계산
	System.out.println(v05);
	
	int v06 = (int)(1.3 + 1.8);		//정수만
	System.out.println(v06);
	
	double v07 = (int) 1.3 + 1.8;		//double로 바꾸니 실수로 잘 계산되네---1+1.8로 계산
	System.out.println(v07);
	
	}

}
