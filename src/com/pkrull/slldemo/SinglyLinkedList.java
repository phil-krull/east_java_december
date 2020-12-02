package com.pkrull.slldemo;

public class SinglyLinkedList {
    public Node head;
    
    public SinglyLinkedList() {
        // your code here
    	this.head = null;
    }
    
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }  
    
    public void printValues() {
    	Node runner = this.head;
    	while(runner != null) {
    		System.out.print(runner.value);
    		System.out.print(" -> ");
    		runner = runner.next;
    	}
    	System.out.println("null");
    }
    
    public void remove() {
    	if(isEmpty() == true) {
    		return;
    	} else if(head.next == null) {
    		head = null;
    	} else {
	    	Node runner = head; 
	    	while(runner.next.next != null) {
	    		runner= runner.next;
	    	}
	    	runner.next = null;
    	}
    }
    
    public boolean isEmpty() {
    	if(head == null) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
    public void removeAt(int num) {
    	if(isEmpty() == true) {
    		return;
    	} else if(num == 0) {
    		// remove the first node
    		head = head.next;
    	} else {
    		int counter = 0;
    		Node runner = head;
    		while(runner.next != null) {
    			counter ++;
    			if(counter == num) {
    				break;
    			}
    			runner = runner.next;
    		}
    		if(num == counter) {
    			runner.next = runner.next.next;
    		}
    	}
    }
    
    
}
