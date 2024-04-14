package org.oddeven;

import java.util.Scanner;

public class loop {
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Enter the num ??");
		int num = s.nextInt();
		
		
		
		
		
		
		for(long i=1; i<=num; i++) {
			System.out.println(i);
			if(i%2==0) {
				System.out.println("Even:"+i);
			}
			else {
				System.out.println("Odd:"+i);
			}
			
		}
	}

}
