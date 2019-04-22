package com.model.dao;


import com.model.entities.Department;
import com.model.entities.Seller;

public class FactoryDAO {


	public static Seller createSellerFactory() {

		return new Seller();
	}

	public static Department createDepartmentFactory() {

		return new Department();
	}

}
