package com.blo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.VilleDAO;

@Service
public class VilleBLOImpl implements VilleBLO {
	
	@Autowired
	private VilleDAO villeDAO;

	@Override
	public String getInfosVilles() {
		// TODO Auto-generated method stub
		villeDAO.findVille();
		return null;
	}
	

}
