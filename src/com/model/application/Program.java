package com.model.application;


import com.model.dao.FactoryDAO;
import com.model.dao.IOperationDao;
import com.model.entities.Department;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		IOperationDao iop = FactoryDAO.createDepartmentFactory();
		
		Department dp = new Department(1, "Computer");
		System.out.println("Department: "+dp.toString());
		
		
		iop.insert(dp);
			
		
		
		
		
		
	}

}
