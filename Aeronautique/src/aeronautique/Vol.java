package aeronautique;

import java.util.Date;

public class Vol {

	private int numVol;
	private int  numPil;
	private int numAv;
	private String villeDep;
	private String villeAr;
	private Date hDep;
	private Date hAr;
	private Pilote lePilote;
	private Avion lAvion;
	
	
	public Vol(int numVol, int numPil, int numAv, String villeDep, String villeAr, Date hDep, Date hAr) {
		super();
		this.numVol = numVol;
		this.numPil = lePilote.getNumPil();
		this.numAv = lAvion.getNumero();
		this.villeDep = villeDep;
		this.villeAr = villeAr;
		this.hDep = hDep;
		this.hAr = hAr;
	}


	@Override
	public String toString() {
		return "Vol [numVol=" + numVol + ", numPil=" + numPil + ", numAv=" + numAv + ", villeDep=" + villeDep
				+ ", villeAr=" + villeAr + ", hDep=" + hDep + ", hAr=" + hAr + "]";
	}
	
	
	
}
