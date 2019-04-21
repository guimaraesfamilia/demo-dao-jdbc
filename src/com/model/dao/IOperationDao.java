package com.model.dao;

import java.util.List;

public interface IOperationDao {

	
	void insert(Object obj);
	void update(Object obj);
	Object deleteById(Integer id);
	Object findById(Integer id);
	List<Object>findAll();
	
}
