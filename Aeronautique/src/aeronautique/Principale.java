package aeronautique;

import java.util.Calendar;

import dao.AvionDAO;
import dao.Connexion;
import dao.DAO;

public class Principale {

	public static void main(String[] args) {
		//Avion Avion = new Avion(1000, "Boeing", "Rennes", 300);
		//System.out.println(Avion);
		//Connexion.afficheSelectEtoile("Avion");
		//Connexion.fermer();
		
		//Avion avion = new Avion(1009, "AirBus 320", "Saint-Malo", 2);
		//(new AvionDAO()).delete(avion);
		
		
		//Avion avion = new Avion(-1, "AirBus 320", "Saint-Malo", 2);
		//(new AvionDAO()).create(avion);
		//System.out.println(avion);
		

		
		//Avion avion = (new AvionDAO()).find(1008);
		//System.out.println(avion);

		Connexion.afficheSelectEtoile("VOL");
		System.out.println("\n******************************\n");
		Connexion.fermer();
	}

	/**
	 * fonction création d'un ligne VOL 
	 * @param un nouvel objet Avion 
	 * @param un nouveau Pilote 
	 * @return un nouveau VOL piloté par le Pilote en utilisant l'Avion définit
	 */
	private static Vol unVol(){
		Avion unAvion = new Avion(1000, "Boeing", "Rennes", 300);

		Pilote unPilote = new Pilote(1000, "Coucou", "Rennes", 10000);

		//Vol nouveauVol = new Vol(1000, unPilote.getNumPil(), unAvion.getNumero(), "Rennes", "Paris", Calendar.ALL_STYLES, Calendar.ALL_STYLES);
		return null; //nouveauVol;

	}
}
