/**
 * Classe représentant le tir d'un missile par un Joueur.
 */

import java.awt.Graphics;

import MG2D.*;
import MG2D.geometrie.*;


public class Tir extends Texture{
	
	public Tir() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tir(Couleur couleur, String chemin, Point a, int larg, int haut) {
		super(couleur, chemin, a, larg, haut);
		// TODO Auto-generated constructor stub
	}

	public Tir(Couleur couleur, String chemin, Point a) {
		super(couleur, chemin, a);
		// TODO Auto-generated constructor stub
	}

	public Tir(String chemin, Point a, int larg, int haut) {
		super(chemin, a, larg, haut);
		// TODO Auto-generated constructor stub
	}

	public Tir(String chemin, Point a) {
		super(chemin, a);
		// TODO Auto-generated constructor stub
	}

	public Tir(Texture t) {
		super(t);
		// TODO Auto-generated constructor stub
	}
	
}
