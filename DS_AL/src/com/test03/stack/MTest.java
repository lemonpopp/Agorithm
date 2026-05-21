package com.test03.stack;

public class MTest {
	public static void main(String[] args) throws Exception {
		Stack s = new Stack(16);
		
		System.out.println("size: " + s.size());
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.dump();
		
		System.out.println("peek: " + s.peek());
		
		s.push(5);
		s.dump();
		System.out.println("peek: " + s.peek());
		
		System.out.println("pop: " + s.pop());
		System.out.println("pop: " + s.pop());
		s.dump();
		
		System.out.println("isEmpty: " + s.isEmpty());
		s.clear();
		System.out.println("clear 후 isEmpty: " + s.isEmpty());
		
		//s.pop(); 에레! 비어있는 stack에서 데이터 추출 불가능

		System.out.println("------------");
		s = new Stack(3);
		s.push(1);
		s.push(2);
		s.push(3);
		
		s.dump();
		System.out.println("indexOf: " + s.indexOf(3));
		System.out.println("indexOf: " + s.indexOf(12));
		System.out.println("isFull: " + s.isFull());
		
		//s.push(4); 용량을 벗어나는 수의 데이터를 push 불가능
	}

}
