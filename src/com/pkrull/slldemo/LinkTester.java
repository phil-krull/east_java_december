package com.pkrull.slldemo;

public class LinkTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList sl = new SinglyLinkedList();
		sl.add(7);
		sl.add(8);
		sl.add(9);
		sl.add(10);
		sl.add(10);
		sl.add(11);
		System.out.println(sl.head.value);
		System.out.println(sl.head.next.value);
		System.out.println(sl.head.next.next.value);
		sl.printValues();
		sl.remove();
		sl.printValues();
		sl.removeAt(4);
		sl.printValues();
	}

}
