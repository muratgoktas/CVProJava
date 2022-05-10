package com.CvProJava.CvPro.Business;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import com.CvProJava.CvPro.DataAccess.IGenericDao;

@Repository
public class PersonelInformationManager <PersonelInformation extends Serializable>
extends BusinessManager<PersonelInformation> implements IGenericService<PersonelInformation>{

	@Override
	public void setClass(Class<PersonelInformation> classToSet) {
		
	}
	public PersonelInformationManager(IGenericDao<PersonelInformation> genericDao) {
		super(genericDao);
		
	}
	

}
