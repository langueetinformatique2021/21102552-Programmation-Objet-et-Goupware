package devoir;

public class Cercle extends FigureMetrique implements Comparable<Cercle>{
	private double rayon;
	
	public Cercle(String co ,double n) {
		super(co);
		this.rayon = n;
	}
	public double getRayon(){
		return this.rayon;
	}
	@Override
	public double perimetre() {
		double perimetre =  2* Math.PI*rayon;
		return perimetre;
	}
	@Override
	public double surface() {
		double surface =Math.PI*rayon*rayon;
		return surface;
	}
	@Override
    public int compareTo(Cercle autreCircle) {
    	return (int) (this.perimetre()-autreCircle.perimetre());
    }

    public void afficher() {
		System.out.printf("C'est un cercle de couleur:"+this.getCouleur()+'\n'+"Son rayon est:"+this.getRayon()+'\n');
    	System.out.printf("Le surface du cercle: "+this.surface()+'\n');
		System.out.printf("Le petrimetre du cercle: "+this.perimetre()+'\n');

    }
	public void compare(Cercle p2) {
		
		if (this.compareTo(p2) > 0) 
			System.out.println("Le circle 1 est plus grand que circle 2 ");
		else  if  (this.compareTo(p2) ==  0) 
			System.out.println( "Le circle 1 et le perimetre de circle 2 sont égale"); 
		else System.out.println( "Le circle 2 est plus grand que circle 1 ");
		
	}
}
	
