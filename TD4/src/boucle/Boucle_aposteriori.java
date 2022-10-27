package boucle;
/***
 * 
 * @author shailynnxie
 *
 */

public class Boucle_aposteriori {
	/***
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String s1 = "azerty", s2 = "ytreza";
		int i1 = 0, i2 = s2.length() - 1;
		char c1 =s1.charAt(i1);
		char c2 =s2.charAt(i2);
		boolean flag = false;
		 
		if(s1.length() == s2.length()) {
			do {
				i1++;
				i2--;
			}
			while (i1<i2);
			if(c1!=c2) {
				flag = false;
				System.out.println(flag);}


			else {
			System.out.println("mot miroir");
			flag = true;
			}
		
	}
	
	
	}

}
