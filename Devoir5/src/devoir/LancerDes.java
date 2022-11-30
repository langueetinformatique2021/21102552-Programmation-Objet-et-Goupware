package devoir;
import java.util.ArrayList;
/**
 * 
 * @author shailynnxie
 *
 */
public class LancerDes extends Aleat {

	String lanceur = "nom";
	int num = 6;
	public LancerDes(String lanceur,int num) {

		super(num);
		this.lanceur = lanceur;
		this.num = num;
	}
	public void showLanceur() {
		System.out.println("Lanceur: "+this.lanceur);
	}

	public TroisDes lancer() throws E421 {
		TroisDes tire = new TroisDes(super.get(), super.get(), super.get());
		this.test421(tire, lanceur);
		return tire;

	}

	private void test421(TroisDes tire, String nom) throws E421 {
		int d1 = tire.d1();
		int d2 = tire.d2();
		int d3 = tire.d3();
		ArrayList<Integer> list = new ArrayList<>();
		list.add(d1);
		list.add(d2);
		list.add(d3);
		
		if (d1 == 4) if (d2 == 2)if (d3== 1) throw new E421(tire, nom);
		if (list.contains(4)) if (list.contains(2)) if (list.contains(1)) throw new E421(nom, tire);
	}		
	
	
}
