package devoir;

public abstract class FigureMetrique {
	/** création et gestion d'une figure géométrique*/
    protected String couleur = "noir";
    
    /** création d'une nouvelle instance de la classe FigureGeometrique
   @param co couleur de la figure*/

    public FigureMetrique (String co) {
        couleur = co; // couleur par défaut
    }

	/** calcul du périmètre d'une figure géométrique
		 * @return périmètre
		 */    
    public String getCouleur() {
    	return this.couleur;
    }
	public abstract double perimetre();

	/** calcul de la surface d'une figure géométrique
	 * @return surface
	 */    
	public abstract double surface();
	} // fin de définition de la classe
	
	