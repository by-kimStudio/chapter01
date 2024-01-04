package com.javaex.ex02;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		//안내출력
		System.out.println("이름을 입력하세요.");
		
		//이름 출력
		System.out.print("이  름 : ");
		
		//이름 입력 받기
		String name = sc.nextLine();
		
		//결과 출력
		System.out.println("당신의 이름은 " + name + " 입니다.");
		
		sc.close();
		
	}

}
