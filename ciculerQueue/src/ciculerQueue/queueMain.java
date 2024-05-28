package ciculerQueue;

public class queueMain {
public static void main(String[] args) {
	QueueX mainqueue = new QueueX(5);
	
	mainqueue.insert('k');
	mainqueue.insert('y');
	mainqueue.insert('z');
	
	while(!mainqueue.isEmpty()) {
		System.out.println(mainqueue.remove());
	}
}
}
