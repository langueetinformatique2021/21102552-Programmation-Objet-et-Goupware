/*
 * Créé le 31 oct. 2011
 */
package ececute;

import atelier06.CarreMulticolore;

/**
 * @author montacie
 *
 */
public class testCarreMulticolore {

	public static void main(String[] args) {
		float x = (float)2.1;
		CarreMulticolore cm = new CarreMulticolore(x, "violet");
		System.out.println(cm.perimetre());
	}
}
