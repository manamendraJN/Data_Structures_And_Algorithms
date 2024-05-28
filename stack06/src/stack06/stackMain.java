package stack06;

import java.util.Scanner;

public class stackMain {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter stack size : ");
		
		int size = scn.nextInt();
		
		stackX element = new stackX(size);
		
		while(!element.isFull()) {
			System.out.print("Enter stack element : ");
			int x = scn.nextInt();
			element.push(x);
			}
		
		while (!element.isEmpty()) {
			System.out.println("Yahoo "+element.pop());
		}
		
	}

}
