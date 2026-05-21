package com.test01.recursion;

import java.util.Scanner;

public class Test01_RecursionTest {
	//팩토리얼값 재귀함수로 처리
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int no = sc.nextInt();
		//1.for
		int res = 1;
		for(int i=1; i<=no; i++) {
			res *= i;
		}
		System.out.println("for 이용한 결과: " + res);
		
		//------------------------
		//2.재귀함수
		
		System.out.println("재귀함수 이용한 결과: " + factorial(no));
		
	}
	
	public static int factorial(int no) {
		/*if(no==1) {
			//종료 조건
			return 1;
		}else {
			return no*factorial(no-1);
		}*/
		return (no==1)? 1: no*factorial(no-1);
	}

}
