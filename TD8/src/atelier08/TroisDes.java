package atelier08;

public class TroisDes extends Aleat{

	private String lanceur;

	public TroisDes(int maximum,String lanceur) {
		super(maximum);
		this.lanceur = lanceur;
	}
	
	public String getUser() {
		return lanceur;
	}
}
