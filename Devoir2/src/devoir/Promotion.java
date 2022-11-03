package devoir;
/**
 * 
 * @author shailynnxie
 *définir une class de la promotion d’étudiants.
 */
public class Promotion extends Etudiant {
	/**
	 * attributs ajouté dans cette class
	 */
	private int année_promo;
	private double moyenne_;

	public Promotion(int année, String nom, String prenom, String idNum, String major, int age, double moyenne) {
		/**
		 * construteur
		 * la classe promotion hérite les attributs de la classe Etudiant
		 */
		super(nom, prenom, idNum, major, age, moyenne);
		année_promo=année;
		moyenne_=moyenne;
	}

	public void decision() {
		
		/**
		 * une jugement pour vérifier si l'étudiant est validé son année
		 * @param
		 * moyenne d'étudiant
		 * @return le résultat de la validation
		 */
		if (moyenne_> 10  ) {
			System.out.println("Félicitation à votre promotion en "+année_promo+" !");
			super.getEtudiant();
		}else {
			super.getEtudiant();			
			System.out.println("nous sommes dans le regret de vous informer que vous n'aiez pas réussi à la promotion en "+année_promo+" !");
			
		}
	}
}

