package devoir;

public class testCrocodile {
	public static void main(String[] args) {
		Crocodile coco=new Crocodile();
		Crocodile.setDomestique_(false);
		coco.présente();
		coco.manger();
		coco.movement();
		coco.vivre();
	}
}