import java.util.Scanner;

public class queueApp {

	public static void main(String[] args) {
		queueX queueMain = new queueX(5);
		stackX stackMain = new stackX(5);
		
		Scanner scn = new Scanner(System.in);
		
		for(int i = 0; i<5 ; i++) {
			queueMain.insert(scn.nextLine().charAt(0));
		}
		
		for(int i = 0; i<5 ; i++) {
			stackMain.push(queueMain.remove());
		}
		
		while(!stackMain.isEmpty()) {
			System.out.println(stackMain.pop());
		}

	}

}
