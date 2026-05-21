package com.test03.stack;

//정수를 저장하여 관리하는 Stack
public class Stack {
	private int[] s;         //데이터 저장용 배열
	private int capacity;    //스택의 용량
	private int ptr;         //포인터, 스택에 저장된 데이터 수
	
	//생성자
	public Stack(int size) {
		ptr = 0;
		capacity = size;
		s = new int[capacity];
	}
	
	//push : 데이터 추가
	public int push(int no) throws Exception {
		if(ptr>= capacity) {
			//스택 가득 참
			System.out.println("[스택이 가득 참]");
			throw new Exception();
		}
		return s[ptr++] = no;
	}
	
	//pop : 데이터 추출
	public int pop() throws Exception {
		if(ptr <= 0) {
			System.out.println("[스택이 비었음]");
			throw new Exception();
		}
		int res = s[--ptr];
		return res;
	}
	
	//peek : 스택 정상에 있는 데이터 확인
	public int peek() throws Exception {
		if(ptr <= 0) {
			System.out.println("[스택이 비었음]");
			throw new Exception();
		}
		return s[ptr-1];
	}
	
	//size : 스택에 저장된 데이터 갯수 확인
	public int size() {
		return ptr;
	}
	
	public boolean isEmpty() {
		return ptr<=0;
	}
	
	public boolean isFull() {
		return ptr == capacity;
	}
	
	//스택 비우기
	public void clear() {
		ptr = 0;
	}
	
	
	//스택에서 no를 찾아 인덱스 리턴
	public int indexOf(int no) {
		for(int i=0; i<ptr; i++) {
			if(s[i] == no) {
				return i; //검색 성공
			}
		}
		return -1;        //검색 실패
	}
	
	//바닥->피크 데이터 확인
	public void dump() {
		if(isEmpty()) {
			System.out.println("[스택이 비었음]");
		}else {
			for(int i=0; i<ptr; i++) {
				System.out.print(s[i]+" ");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	
}
