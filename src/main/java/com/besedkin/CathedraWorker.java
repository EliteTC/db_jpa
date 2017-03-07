package com.besedkin;

import org.springframework.beans.factory.annotation.Autowired;

public class CathedraWorker {
	@Autowired
	private CathedraDao CathedraDao;
	public Cathedra addCathedra(Cathedra Cathedra){
	CathedraDao.addCathedra(Cathedra);
	System.out.println("Cathedra has been added "+Cathedra);
	return Cathedra;
	}
	public Cathedra getCathedra(int id){
	return CathedraDao.getCathedra(id);
	}
	public void saveCathedra(Cathedra Cathedra){
	CathedraDao.saveCathedra(Cathedra);
	System.out.println("Cathedra has been saved "+Cathedra);
	}
}