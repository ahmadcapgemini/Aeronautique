package aeronautique;

import java.util.Calendar;

public class Principale {

	public static void main(String[] args) {

	}

	/**
	 * fonction cr�ation d'un ligne VOL 
	 * @param un nouvel objet Avion 
	 * @param un nouveau Pilote 
	 * @return un nouveau VOL pilot� par le Pilote en utilisant l'Avion d�finit
	 */
	private static Vol unVol(){
		Avion unAvion = new Avion(1000, "Boeing", "Rennes", 300);

		Pilote unPilote = new Pilote(1000, "Coucou", "Rennes", 10000);

		Vol nouveauVol = new Vol(1000, unPilote.getNumPil(), unAvion.getNumero(), "Rennes", "Paris", Calendar.ALL_STYLES, Calendar.ALL_STYLES);
		return nouveauVol;

	}
}
