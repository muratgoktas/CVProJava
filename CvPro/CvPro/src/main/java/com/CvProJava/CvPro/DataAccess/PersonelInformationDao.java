package com.CvProJava.CvPro.DataAccess;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope
public class PersonelInformationDao<PersonelInformation extends Serializable> 
extends HibernateDao<PersonelInformation> implements IGenericDao<PersonelInformation>
{

}
