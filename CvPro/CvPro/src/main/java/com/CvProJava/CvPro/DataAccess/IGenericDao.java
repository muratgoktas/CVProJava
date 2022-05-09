package com.CvProJava.CvPro.DataAccess;

import java.io.Serializable;
import java.util.List;

public interface IGenericDao<T extends Serializable> {
	
	void setClass(Class< T > classToSet);
	T getOneById(final int entiyId);
	List<T> getList();
	T add(T entity) ;
	void delete(T entity);
	void update(T entity);
	void deleteBYId(int entityId);
}
