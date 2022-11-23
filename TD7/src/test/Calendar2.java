package test;

import java.util.*;
import java.util.GregorianCalendar;

/** dérivée de Calendar implémentant un nouvel attribut cours 
 * et trois nouvelles méthodes creation() afficher() et duree() */
public class Calendar2 extends GregorianCalendar {
	
	private boolean cours;
	
	public Calendar2() {
		Date date = new Date();
		this.setTime(date);	
	}
	
	/** affiche la date et l’heure de la création de l’objet */
	/** vérifier si c'est créer pendant le cour 9:30-12:00s*/
	public void creation() {
		System.out.println("Open TIME: " + this.getTime());
		if (this.get(Calendar.HOUR) >=9 && this.get(Calendar.HOUR ) <=12) {
			if(this.get(Calendar.HOUR) ==9) {
				if(this.get(Calendar.MINUTE)>=30){
					cours= true;
			}
			}else {
				cours= true;
			}
		}else {
			cours=false;
		}
		System.out.printf("Pendant le cours:"+cours+'\n');
	}
	
	/** affiche la date et l’heure courante */
	public void afficher() {
		Date date = new Date();
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(date);	
		System.out.println("now TIME: " + calendar.getTime());
	}
	
	
	/** affiche le nombre de secondes depuis la création de l’objet */
	public void duree() {
		Date date = new Date();
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(date);	
		long nbSeconde = (calendar.getTimeInMillis()- this.getTimeInMillis()) / 1000;
		System.out.println("nbSeconde " + nbSeconde);

	}

	

}