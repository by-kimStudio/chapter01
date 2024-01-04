package com.javaex.ex02;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		
		//스캐너준비
		Scanner sc = new Scanner(System.in);
		
		//안내
		System.out.println("이름을 입력해 주세요.");
		
		//이름:
		System.out.print("이 름 : ");
		
		//이름입력받기
		String name = sc.nextLine();
		
		//안내
		System.out.println("나이를 입력해 주세요.");
		
		//나이:
		System.out.print("나 이 : ");
		
		//나이 입력받기
		int age = sc.nextInt();
		
		//안내
		System.out.println("키를 입력해 주세요.");
		
		//키:
		System.out.print("키 : ");
		
		//키 입력받기
		int tall = sc.nextInt();
		
		//출력
		System.out.println("당신의 이름은 " + name + "이고, 나이는 만 " + --age + " 세 이고, 키는 " + tall + "cm 네요!");
		
		//스캐너종료
		sc.close();
	
		//ghghjfgjhgj
	}

}
