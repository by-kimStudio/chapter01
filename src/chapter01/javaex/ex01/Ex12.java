package chapter01.javaex.ex01;

public class Ex12 {
	
	public static void main(String[] args) {
		
		//관계 연산자
		int n1 = 5;
		int n2 = 3;
		
		boolean result = n1<n2;		//f
		System.out.println(result);
		
		System.out.println(n1<n2);  // 5<3 false
		System.out.println(n1>n2);  // 5>3 t
		
		System.out.println(n1<=n2);  // 5<=3 f
		System.out.println(n1>=n2);  // 5>=3 t
		System.out.println(3>=n2);  // 3>=3 t
		
		System.out.println(n1==n2);  // 5==3 f
		System.out.println(n1!=n2);  // 5!=3 t  //같지 않니?(부정어)
		
	}

}
