package boucle;
/***
 * 
 * @author shailynnxie
 *
 */
public class Boucle_apriori {
	/***
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String s1 = "azerty", s2 = "ytreza";
		int i1 = 0, i2 = s2.length() - 1;
		char c1 =s1.charAt(i1);
		char c2 =s2.charAt(i2);
		boolean flag;
		
		if (s1.length() == s2.length()) {
			while (i1<i2) {
				if(c1!=c2) {
					flag = false;
			 		System.out.println(flag);
				}
			
					i1++;
					i2--;
					
				}
			
				System.out.println("mot miroir");
				flag = true;
		}
		}
}
