package com.test06.tree;

public class Mtest {
	public static void main(String[] args) {	
		BinarySearchTree<Integer, Data> tree = new BinarySearchTree<Integer, Data>();
		
		tree.add(5, new Data(5,"lemon"));
		tree.add(10, new Data(10,"park"));
		tree.add(1, new Data(1,"Lee"));
		tree.add(12, new Data(12,"Hong"));
		tree.add(8, new Data(8,"Son"));
		tree.add(9, new Data(9,"Song"));
		tree.add(13, new Data(13,"Choi"));


		tree.print();
		System.out.println("-------------------");
		tree.remove(10);
		tree.print();
		System.out.println(tree.search(13));
	}

}

class Data{
	private Integer no;
	public String name;
	public Data(Integer no, String name) {
		this.no = no;
		this.name = name;
	}
	Integer getKey() {
		return no;
	}
	@Override
	public String toString() {
		return name;
	}
}
