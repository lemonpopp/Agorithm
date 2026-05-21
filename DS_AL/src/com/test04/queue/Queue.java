package com.test04.queue;

public class Queue {
	private int[] q;          //큐, 데이터 저장
	private int capacity;     //큐의 크기, 저장할 데이터의 최대 수
	private int num;          //현재 데이터의 수
	private int front;        //맨 처음
	private int rear;         //맨 마지막
	
	//생성자
	public Queue(int size) {
		num = front = rear = 0;
		capacity = size;
		q = new int[capacity];
	}
	
	//en-queue : 큐에 데이터 추가
	public int enqueue(int no) throws Exception {
		if(num>=capacity) {
			System.out.println("[큐가 가득참]");
			throw new Exception();
		}
		q[rear++] = no;
		num++;
		
		if(rear == capacity) {
			//배열의 마지막 칸에 데이터가 추가되었다면 처음으로 이동시켜라
			rear = 0;		
		}
		return no;
	}
	//de-queue : 큐에서 데이터 추출
	public int dequeue() throws Exception {
		if(num <= 0) {
			System.out.println("[큐가 비었다]");
			throw new Exception();
		}
		
		int val = q[front++];
		num--;
		if(front == capacity) {
			//배열의 마지막 칸에 데이터 추출하였다면 처음으로 이동시켜라
			front = 0;
		}
		
		return val;
	}
	
	//제일 앞의 데이터 확인
	public int peek() throws Exception {
		if(num<=0) {
			System.out.println("[큐가 비었다]");
			throw new Exception();
		}
		return q[front];
	}
	
	public void clear() {
		num = front = rear = 0;
	}
	//큐의 용량 확인
	public int getCapacity() {
		return capacity;
	}
	//큐에 저장된 데이터 수 확인
	public int size() {
		return num;
	}
	public boolean isEmpty() {
		return num==0;
	}
	public boolean isFull() {
		return num==capacity;
	}
	
	//큐의 모든 데이터 출력(front-rear 순으로)
	public void dump() {
		if(num==0) {
			System.out.println("[큐가 비었다]");
		}else {
			for(int i=0; i<num; i++) {
				System.out.print(q[(i+front)%capacity] + " ");
			}
			System.out.println();
		}
	}
	
	public void prn() {
		for(int i=0; i<q.length; i++) {
			System.out.print(q[i] + " ");
		}
		System.out.println();
	}
	
	
}
