package stack06;

public class stackX {
	private int[] arr;
	private int maxSize;
	private int top;
	
	
	public stackX(int maxSize) {
		this.maxSize = maxSize;
		arr = new int[maxSize];
		top = -1;
	}
	
	public boolean isEmpty() {
		return(top == -1);
	}
	
	public boolean isFull() {
		return(maxSize - 1 == top);
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty !");
			return 0;
		}else {
			return(arr[top]);
		}
	}
	
	public void push(int a) {
		if(isFull()) {
			System.out.println("Stack is full !");
			
		}else {
			arr[++top] = a;
		}
	}
	
	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty !");
			return 0;
		}else {
			return(arr[top--]);
		}
	}
	
	

}
