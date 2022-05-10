package com.CvProJava.CvPro.Business;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.CvProJava.CvPro.DataAccess.IGenericDao;

@Service
public abstract class BusinessManager<T extends Serializable> {

	private IGenericDao<T> genericDao;
	@Autowired
	public BusinessManager(IGenericDao<T> genericDao) {
		super();
		this.genericDao = genericDao;
	}

	@Transactional
	public T getOneById(int entiyId) {
		
		return genericDao.getOneById(entiyId);
	}

	@Transactional
	public List<T> getList() {
		
		return this.genericDao.getList();
	}

	@Transactional
	public T add(T entity) {
		
		return genericDao.add(entity);
	}

	@Transactional
	public void delete(T entity) {
		genericDao.delete(entity);
		
	}

	@Transactional
	public void update(T entity) {
		genericDao.update(entity);
		
	}
	@Transactional
	public void deleteBYId(int entityId) {
		genericDao.deleteBYId(entityId);
		
	}

}
