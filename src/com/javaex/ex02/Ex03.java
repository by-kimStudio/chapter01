package com.javaex.ex02;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		
		//스캐너준비
		Scanner sc = new Scanner(System.in);	//키보드 입력을 부르겠다는 뜻//하나만 불러서 써. 이름용, 나이용 따로 필요없어.
		
		//안내문구
		System.out.println("이름을 입력해 주세요.");
		
		//이름:
		System.out.print("이 름 : ");
		
		//이름 입력받기
		String name = sc.nextLine();
		
		//안내 문구
		System.out.println("나이를 입력해 주세요.");
		
		//나이:
		System.out.print("나 이 : ");
		
		//나이 입력받기
		int age = sc.nextInt();
		
		//출력
		System.out.println("당신의 이름은 " + name + " 이고, 나이는 만 " + --age + "세 입니다.");
		
		//스캐너종료
		sc.close();
		
	}

}
