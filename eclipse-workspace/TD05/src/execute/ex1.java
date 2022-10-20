package execute;

import atelier05.Date;

public class ex1 {
	public static void main(String[] args) {
		Date today = new Date(20,10,2020);
		Date fete14 = new Date(14, 7, 2023);
		
		int nJours = 0;
		do { 
			today.Incrementer();
			nJours++;
		}while (today.CompareTo(fete14));
		
		System.out.println(nJours);
	}
}
