package atelier08;

public class PileFace {
	public static void main(String[] args) {
		Aleat n = new Aleat(7);
		
		int i=0,j=0,pile=0,face=0;
		double somme = 1000.0;
		do {
			i++;j+=guess(n);
			if(guess(n)==0) {
				face++;
			}else {
				pile++;
			}
		}while(i<somme);
		System.out.println("Nombre de face:"+face);
		System.out.println("Nombre de pile:"+pile);

		
	}
	public static int guess(Aleat nombre) {
		return (nombre.get()>4) ? 1:0;
				}
}
