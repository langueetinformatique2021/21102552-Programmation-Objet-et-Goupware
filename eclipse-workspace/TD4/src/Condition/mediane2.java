package Condition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/***
 * 
 * @author shailynnxie
 *
 */
public class mediane2 {
	/***
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int p1 = 10, p2 = 9, p3 = -1, p4 = 4, p5 = 8;
		List<Integer> total = new ArrayList<Integer>();
		total.add(p1);
		total.add(p2);
		total.add(p3);
		total.add(p4);
		total.add(p5);
		
		double temp= median(total);
		int p6=(int)temp;
		System.out.println(p6);

	}

	private static double median(List<Integer> total) {
		double j = 0;
	    Collections.sort(total);
	    int size = total.size();
	    if (size % 2 == 1) {
	        j = total.get(size / 2);
	    } else {
	        j = total.get(size / 2 - 1) + total.get(size / 2) / 2.0;
	    }
		return j;

	}
}
