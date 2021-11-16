package com.dao;

import com.dto.Ville;

public class VilleDAOImpl implements VilleDAO{

	@Override
	public Ville findVille() {
		Ville ville = new Ville();
		ville.setCodeCommune("plop");
		//ville.setNomCommune("plop");
		
		// TODO Auto-generated method stub
		return ville;
	}

}
