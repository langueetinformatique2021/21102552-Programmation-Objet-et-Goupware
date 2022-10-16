package iteration;

public class ex1 {
	public static void main(String[] args) {
		String[] prenoms= {"Christian", "Karen","Victoria","Agatha","Philippe","Djamé"};
		int imin=0;
		String[] str= {"Christian", "Karen","Victoria","Agatha","Philippe","Djamé"};
        str = ordre(str);
		for (int i= 0; i < prenoms.length; i++) {

			if (prenoms[i].equals(str[0])) {
				imin += i;

			}	

	}
		System.out.println(imin); 

		 }
	  
	


	private static String[] ordre(String[] str) {
		 for(int i = 0; i < str.length; i++)
	        {
	            for(int j = i+1; j < str.length; j++)
	            {
	                if(str[i].compareTo(str[j]) > 0)
	                {
	                	  String  temp = str[i];
	                       str[i] = str[j];
	                       str[j] = temp;	                }
	            }
	        }		return str;
	}
}
	
