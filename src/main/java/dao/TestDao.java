package dao;

import java.util.List;

import metier.entities.Voyage;

public class TestDao {

	public static void main(String[] args) {
		VoyageDaoImpl pdao= new VoyageDaoImpl();
		Voyage prod= pdao.getProduit(2L);
		System.out.println(prod);
		prod.setNomProduit("toto");
		pdao.updateProduit(prod);
		System.out.println("after update " +prod);
		
		
	}

}