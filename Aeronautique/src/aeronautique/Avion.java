package aeronautique;

public class Avion {

//modification sans push sur l'ancien 
	private int numero;
	private String nom;
	private String loc;
	private int capacite; 

	
	

	public Avion(int numero, String nom, String loc, int capacite) {
		super();
		this.numero = numero;
		this.nom = nom;
		this.loc = loc;
		this.capacite = capacite;
	}



	public Avion(int numero) {
		super();
		this.numero=numero;
	}



	@Override
	public String toString() {
		return "Avion [numero=" + numero + ", nom=" + nom + ", loc=" + loc + ", capacite=" + capacite + "]";
	}



	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getLoc() {
		return loc;
	}



	public void setLoc(String loc) {
		this.loc = loc;
	}



	public int getCapacite() {
		return capacite;
	}



	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}



}
