package com.CvProJava.CvPro.DataAccess;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class HibernateDao<T extends Serializable> {

	private Class<T> genericClass;
	
	@PersistenceContext(unitName = "entityManagerFactory")
    private EntityManager entityManager;


	public void setClass(final Class<T> classToSet) {
        this.genericClass = classToSet;
    }
	 
	
	public T getOneById (final int entiyId) {
		
		  return entityManager.find(genericClass, entiyId);
	}

	@SuppressWarnings("unchecked")
	public List<T> getList() {
		
		return entityManager.createQuery("from"+ genericClass.getName()).getResultList();
	}

	public T add(T entity) {
		entityManager.persist(entity);
		return entity;
		
	}


	public void delete(T entity) {
		entityManager.remove(entity);
		
	}


	public void update(T entity) {
		entityManager.merge(entity);
		
	}


	public void deleteBYId(int entityId) {
		final T entity= getOneById(entityId) ;
		delete(entity);

	}

}
