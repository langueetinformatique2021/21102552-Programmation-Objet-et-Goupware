package devoir;

public class testCercle {
	public static void main(String [] args) {
		Cercle c = new Cercle("rouge",5);
		Cercle e = new Cercle("blanc",6);
		c.afficher();
		e.afficher();
		comparePerimetre(c,e);
		
	}
	
	public static void comparePerimetre(Cercle p1,Cercle p2) {
		
		int comparaison = p1.compareTo(p2);
		if (comparaison > 0) 
			System.out.println("Le circle 1 est plus grand que circle 2 ");
		else  if  (comparaison ==  0) 
			System.out.println( "Le circle 1 et le perimetre de circle 2 sont égale"); 
		else System.out.println( "Le circle 2 est plus grand que circle 1 ");
		
	}



}
