package com.CvProJava.CvPro.Business;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import com.CvProJava.CvPro.DataAccess.IGenericDao;

@Repository
public class EducationInformationmanager<EducationInformation extends Serializable >
extends BusinessManager<EducationInformation> implements IGenericService<EducationInformation>
{

	public EducationInformationmanager(IGenericDao<EducationInformation> genericDao) {
		super(genericDao);
		
	}

	@Override
	public void setClass(Class<EducationInformation> classToSet) {
	
		
	}

	

}
