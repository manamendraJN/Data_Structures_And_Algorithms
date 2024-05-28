package ciculerQueue;

public class QueueX {

	private char [] uqeueArr;
	private int maxSize;
	private int rear;
	private int front;
	private int item;
	
	public QueueX(int size) {
		this.maxSize = size;
		uqeueArr = new char[maxSize];
		rear = -1;
		front = 0;
		item = 0;
	}
	
	public boolean isFull() {
		return(maxSize == item);
	}
	
	public boolean isEmpty() {
		return(item == 0);
	}
	
	public void insert(char c) {
		if(isFull()) {
			System.out.println("Stack is full !");
		}else {
			
			if(rear == maxSize-1) {
				rear = -1;
			}
			uqeueArr[++rear] = c;
			item ++ ;
		}
	}
	
	public char remove() {
		if(isEmpty()) {
			System.out.println("Stack is empty !");
			return 0 ; 
		}else {
			char temp = uqeueArr[front++];
			if(maxSize == front) {
				front = 0;
			}
			item --;
			return(temp);
			}
	}
	
	public char peek() {
		if(isEmpty()) {
			System.out.println("queue is empty !");
			return 0;
		}else {
			return(uqeueArr[front]);
		}
	}
	
	
}
