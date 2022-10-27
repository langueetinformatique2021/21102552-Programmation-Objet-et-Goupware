package Condition;
/***
 * 
 * @author shailynnxie
 *
 */

public class maximum {
	/***
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
	
		int p1 = 10, p2 = 9, p3 = -1, p4 = 4, p5 = 8;
		
		int temp = (p1>p2) ? p1:p2;
		p4 = (p3>temp) ? p3 : temp ;
		
		
		System.out.println(p4) ;
		

	}
}
