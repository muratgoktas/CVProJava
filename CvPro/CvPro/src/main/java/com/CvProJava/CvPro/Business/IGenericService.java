package com.CvProJava.CvPro.Business;

import java.io.Serializable;
import java.util.List;

public interface IGenericService <T extends Serializable>{

	void setClass(Class< T > classToSet);
	T getOneById(final int entiyId);
	List<T> getList();
	T add(T entity) ;
	void delete(T entity);
	void update(T entity);
	void deleteBYId(int entityId);
}
