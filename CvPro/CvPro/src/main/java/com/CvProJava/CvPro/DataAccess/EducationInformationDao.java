package com.CvProJava.CvPro.DataAccess;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope
public class EducationInformationDao<EducationInformation extends Serializable>
extends HibernateDao<EducationInformation> implements IGenericDao<EducationInformation>
{

}
