
public class queueX {

	private char[] queueArr;
	private int maxSize;
	private int rare;
	private int front;
	private int items;
	
	
	public queueX(int size) {
		this.maxSize = size;
		queueArr =new char[maxSize];
		rare =-1;
		front = 0;
		items = 0;
	}
	
	public boolean isFull() {
		return(maxSize == items);
	}
	
	public boolean isEmpty() {
		return(items == 0);
	}
	
	public void insert(char i) {
		if(isFull()) {
			System.out.println("Stack is full !");
		}else {
			if(rare == maxSize-1) {
				rare = -1;
			}
			queueArr[++rare] = i;
			items++;
		}
	}
	
	public char remove() {
		if(isEmpty()) {
			System.out.println("queue is empty !");
			return 0;
		}else {
			char temp = queueArr[front++];
			if(front == maxSize) {
				front =0 ;
			}
			items --;
			return (temp);
		}
	}
	
	
}
