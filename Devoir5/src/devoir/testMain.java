package devoir;

public class testMain {
	public static void main(String[] args) throws E421 {
		LancerDes ld = new LancerDes("E421",4);
		TroisDes tire = ld.lancer();
		ld.showLanceur();
		tire.show();
		
	}

}
