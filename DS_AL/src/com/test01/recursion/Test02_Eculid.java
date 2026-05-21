package com.test01.recursion;

public class Test02_Eculid {
	//유클리드 호제법 : 두 수의 최대 공약수를 구하는 알고리즘
	public static void main(String[] args) {
		System.out.println("최대 공약수: " + eculid(26,6));
	}
	
	public static int eculid(int no1, int no2) {
		if(no2==0) {
			return no1;
		}else {
			return eculid(no2,no1%no2);
		}
	}
}
