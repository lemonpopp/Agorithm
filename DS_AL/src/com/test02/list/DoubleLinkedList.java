package com.test02.list;

import java.util.Comparator;

public class DoubleLinkedList<E> {
	
	//노드
	class Node<E>{
		private E data;        //데이터
		private Node<E> prev;  //앞쪽포인터(앞쪽 노드 참조)
		private Node<E> next;  //앞쪽포인터(뒤쪽 노드 참조)
		
		//생성자
		Node(){
			data = null;
			prev = this;
			next = this;
		}
		Node(E obj, Node<E> prev, Node<E> next){
			data = obj;
			this.prev = prev;
			this.next = next;
		}
	}
	
	private Node<E> head;	//머리
	private Node<E> crnt;	//선택 포인터
	
	//생성자
	public DoubleLinkedList() {
		head = crnt = new Node<E>();
		//더미노드
	}
	
	//기능구현
	//비었는지 확인
	public boolean isEmpty() {
		return head.next == head;
	}
	
	//탐색
	public E search(E obj, Comparator<? super E> c) {
		                            //<? super E> -> 와일드카드, E 또는 E의 부모타입
		Node<E> ptr = head.next;
		
		while(ptr != head) {
			if( c.compare(obj, ptr.data) == 0 ) {	// 같은걸 찾았디. 검색 성공
				crnt = ptr;
				return ptr.data;
			}
			ptr = ptr.next;			//같지 않으면 다음 노드를 저장
		}
		
		return null;
	}
	
	//crnt가 가르키는 노드 확인
	public void prntCrntNode() {
		if(isEmpty()) {
			System.out.println("[노드가 없습니다.]");
		}else {
			System.out.println(crnt.data);
		}
	}
	
	//리스트 전체 노드 확인
	public void dump() {
		Node<E> ptr = head.next;
		while(ptr != head) {
			System.out.println(ptr.data);
			ptr = ptr.next;
		}
	}
	
	//노드 추가(crnt 노드 다음에 추가)
	public void add(E obj) {
		Node<E> node = new Node<E>(obj,crnt,crnt.next);
		crnt.next = crnt.next.prev = node;
		crnt = node;
	}
	
	//crnt 노드(선택노드) 하나씩 이동
	public boolean next() {
		if(isEmpty() || crnt.next == head) {
			//뒤로 이동할 노드가 없으므로 종료
			return false;
		}
		crnt = crnt.next;
		return true;
	}
	public boolean prev() {
		if(isEmpty() || crnt.prev == head) {
			return false;
		}
		crnt = crnt.prev;
		return true;
	}
	
	//제일 앞에 노드 추가(head 바로 다음에 노드 추가)
	public void addFirst(E obj) {
		crnt = head;
		add(obj);
	}
	//제일 뒤에 노드 추가
	public void addLast(E obj) {
		crnt = head.prev;
		add(obj);
	}
	
	
	//노드 삭제
	public void removeCrnt() {
		if(!isEmpty()) {
			crnt.prev.next = crnt.next;
			crnt.next.prev = crnt.prev;
			crnt = crnt.prev;
			if(crnt == head) {
				crnt = head.next;
			}
		}
	}
	
	
	//첫번째 노드 삭제
	public void removeFirst() {
		crnt = head.next;
		removeCrnt();
	}
	//마지막 노드 삭제
	public void removeLast() {
		crnt = head.prev;
		removeCrnt();
	}
	
	//선택 삭게
	public void remove(Node p) {
		Node<E> ptr = head.next;
		while(ptr != head) {
			if(ptr == p) {
				crnt = p;
				removeCrnt();
				break;
			}
			ptr = ptr.next;
		}
	}
	
	//전체 삭제
	public void clear() {
		while(!isEmpty()) {
			removeFirst();
		}
	}
	
}