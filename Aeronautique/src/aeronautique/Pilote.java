package aeronautique;

public class Pilote {

	private int numPil;
	private String nomPil;
	private String adr; 
	private int sal;
	
	
	public Pilote(int numPil, String nomPil, String adr, int sal) {
		super();
		this.numPil = numPil;
		this.nomPil = nomPil;
		this.adr = adr;
		this.sal = sal;
	}


	
	
	
	@Override
	public String toString() {
		return "Pilote [numPil=" + numPil + ", nomPil=" + nomPil + ", adr=" + adr + ", sal=" + sal + "]";
	}





	public int getNumPil() {
		return numPil;
	}




	


}
