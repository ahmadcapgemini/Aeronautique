package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import aeronautique.Avion;


public class AvionDAO extends DAO<Avion> {

	private static final String TABLE = "Avion";
	private static final String CLE_PRIMAIRE = "numav";
	@Override
	public boolean create(Avion obj) {
		boolean succes= true;
		try {	
			String requette = "INSERT INTO " + TABLE + " (nomav, loc, capacite) VALUES (?, ?, ?)";
			PreparedStatement pst = Connexion.getInstance().prepareStatement(requette);
			pst.setString(1,  obj.getNom());
			pst.setString(2,  obj.getLoc());
			pst.setInt(3,  obj.getCapacite());
			pst.executeUpdate();
			
			obj.setNumero(Connexion.getMaxId(CLE_PRIMAIRE, TABLE));
			
			
		} catch (SQLException e) {
			succes = false; 
			e.printStackTrace();
		}
	
		
		return false;
	}

	@Override
	public boolean delete(Avion obj) {
		boolean succes = true;
		try {
			int id = obj.getNumero();
			String requette = "DELETE FROM "+ TABLE+" where "+ CLE_PRIMAIRE+ " = ?";
			PreparedStatement pst = Connexion.getInstance().prepareStatement(requette);
			pst.setInt (1, id); // 1 correspond au ? dans la partie String de la requette elle demande de remplacer 1 par le id voir create 
			pst.executeUpdate();
		} catch (SQLException e) {
			succes = false;
			e.printStackTrace();
		}
		return succes;
	}

	@Override
	public boolean update(Avion obj) {
		//String requette = "UPDATE "+TABLE +" SET nomav =?, loc =?, capacite =?" +
		return false;
	}

	@Override
	public Avion find(int id) {
		Avion avion = null;
		try {
		String requette = "SELECT * FROM " + TABLE +" WHERE " + CLE_PRIMAIRE+ " = "+id;
		ResultSet rs = Connexion.executeQuery(requette);
		rs.next();
		String nom = rs.getString("nomav");
		String loc = rs.getString("loc");
		int capacite = rs.getInt("capacite");
		avion = new Avion (id, nom, loc, capacite);
				
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return avion;
	}

}
