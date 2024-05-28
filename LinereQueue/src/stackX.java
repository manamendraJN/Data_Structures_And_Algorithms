

public class stackX {

	private char[] stackArr;
	private int maxSize;
	private int top;
	
	
	public stackX(int maxSize) {
		this.maxSize = maxSize;
		stackArr = new char[maxSize];
		top = -1;
	}
	
	public boolean isEmpty() {
		return(top == -1);
	}
	
	public boolean isFull() {
		return(maxSize - 1 == top);
	}
	
	public void push(char c) {
		if(isFull()) {
			System.out.println("Stack is full !");
		}else {
			stackArr[++top] = c;
		}
	}
	
	public char pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty !");
			return 0;
		}else {
			return(stackArr[top--]);
		}
	}
	
	public char peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty !");
			return 0;
		}else {
			return(stackArr[top]);
		}
	}
	
	
}
