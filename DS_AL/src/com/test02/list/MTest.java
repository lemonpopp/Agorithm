package com.test02.list;

import java.util.Comparator;

public class MTest {

	public static void main(String[] args) {
		DoubleLinkedList<String> list1 = new DoubleLinkedList<String>();
		
		list1.addFirst("첫번째");
		list1.addLast("두번째");
		list1.addFirst("세번째");
		list1.addLast("네번째");
		list1.add("마지막");
		
		list1.dump();
		
		System.out.println("--------------");
		list1.removeFirst();
		list1.removeLast();
		list1.prev();
		list1.removeCrnt();
		list1.dump();
		
		System.out.println("--------------");
		list1.clear();
		list1.dump();
		
		System.out.println("--------------");
		DoubleLinkedList<Data> list2 = new DoubleLinkedList<Data>();
		
		list2.addFirst(new Data(1,"aaa"));
		list2.add(new Data(3, "bbb"));
		list2.addFirst(new Data(16,"DDD"));
		list2.addLast(new Data(22,"EEE"));
		list2.dump();
		
		System.out.println("--------------");
		list2.removeFirst();
		list2.dump();
		
		System.out.println("--------------");
		list2.prntCrntNode();
		
		System.out.println("--------------");
		Data search = list2.search(new Data(0, "xx"), new NameOrder());
		System.out.println("탐색: " + search);
		
		search = list2.search(new Data(22,"EEE"), new NameOrder());
		System.out.println("탐색: " + search);
		
	}

}
class NameOrder implements Comparator<Data>{

	@Override
	public int compare(Data o1, Data o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}


class Data{
	private int no;
	private String name;
	public Data() {}
	public Data(int no, String name) {
		this.no = no;
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "[" + no + "]\t" + name;
	}
	
}












