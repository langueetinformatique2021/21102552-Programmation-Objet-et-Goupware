package atelier5;

import java.util.Calendar;

/** Création et gestion améliorées de dates 
 * (seconde, minute, heure, jour, mois, année) 
 */
public class Date2 extends Date {
	private int seconde, minute, heure;
	
	public Date2(int j, int m, int a) {
		super(j, m, a);// appel du constructeur de Date
		heure = Calendar.HOUR_OF_DAY;
		minute = Calendar.MINUTE;
		seconde = Calendar.SECOND;
		}
	
	public Date2() {
		super(0, 0, 0); 	// sinon appel automatique du constructeur vide de Date
		heure = Calendar.HOUR_OF_DAY;
		minute = Calendar.MINUTE;
		seconde = Calendar.SECOND;
		}
	
	/** Redfinition - Affichage de la date et de l'heure */
	public void Afficher() {
		super.Afficher();
		System.out.println(heure+" "+minute+" "+seconde); 
	}
	
	/** Affichage de l'heure */
	public void Afficher2() {
		System.out.println(heure+":"+minute+":"+seconde); 
		}

} // fin de la d�finition de la classe Date2

