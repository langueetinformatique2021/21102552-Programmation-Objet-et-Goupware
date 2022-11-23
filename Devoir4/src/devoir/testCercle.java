package devoir;

public class testCercle {
	public static void main(String [] args) {
		Cercle c = new Cercle("rouge",5);
		Cercle e = new Cercle("blanc",6);
		c.afficher();
		e.afficher();
		c.compare(e);
	}
	




}
