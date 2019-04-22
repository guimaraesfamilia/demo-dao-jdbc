package com.model.application;


import java.util.Scanner;

import com.model.dao.FactoryDAO;
import com.model.dao.IOperationDao;
import com.model.entities.Department;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		IOperationDao iop = FactoryDAO.createDepartmentFactory();
		
		Department dp = new Department(1, "Computer");
		System.out.println("Department: "+dp.toString());
		
		
		System.out.print("Id.: ");
		int id = sc.nextInt();
		iop = FactoryDAO.createSellerFactory();
		
		System.out.println(iop.findById(id));
				
				
			sc.close();

	}

}
