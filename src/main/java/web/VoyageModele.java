package web;

import java.util.ArrayList;
import java.util.List;

import metier.entities.Voyage;

public class VoyageModele {
	private String motCle;
	List<Voyage> produits = new ArrayList<>();
	
	
	public String getMotCle() {
		return motCle;
	}
	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}
	public List<Voyage> getProduits() {
		return produits;
	}
	public void setProduits(List<Voyage> produits) {
		this.produits = produits;
	}
	
	

}