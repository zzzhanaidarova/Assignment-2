package com.company;

public class Main {

    public static void main(String[] args) {
	MyStack stack = new MyStack();

	for (int i=1; i<11; i++){
	    stack.push(i);
    }

        System.out.println("Length = " + stack.size());

	Integer n = (Integer) stack.pop();
	System.out.println("New length = 9; length = " + stack.size());
	System.out.println("Expected popped value 10, popped value " + n);

	stack.push(n);

	System.out.println("Empty? " + stack.empty());

	System.out.println("Peek " + stack.peek());

	System.out.println("----------------------");

	MyQueue myQueue = new MyQueue();
	for (int i=1; i<11; i++){
		myQueue.enqueue(i);
	}
		System.out.println("Size: " + myQueue.size());

	Integer m = (Integer) myQueue.dequeue();
		System.out.println("New size: " + myQueue.size());
		System.out.println("Removed item: " + m);
		System.out.println("--------------");

		for (int i=1; i<5; i++){
			Integer k = (Integer) myQueue.dequeue();
			System.out.println("New size: " + myQueue.size());
			System.out.println("Removed item: " + k);
			System.out.println("--------------");
		}

		myQueue.enqueue(100);
		Integer p = (Integer) myQueue.dequeue();
		System.out.print("Removed items: " );
		while (p != null){
			System.out.print(p + ", ");
			p = (Integer) myQueue.dequeue();
		}

    }
}
