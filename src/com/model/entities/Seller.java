package com.model.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import com.model.dao.IOperationDao;

public class Seller implements Serializable, IOperationDao {


	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private String email;
	private Date birthdate;
	private Double basesalary;
	private Department department;
	
	public Seller() {
	}

	public Seller(Integer id, String name, String email, Date birthdate, Double basesalary, Department department) {
		super();
		this.setId(id);
		this.setName(name);
		this.setEmail(email);
		this.setBirthdate(birthdate);
		this.setBasesalary(basesalary);
		this.setDepartment(department);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public Double getBasesalary() {
		return basesalary;
	}

	public void setBasesalary(Double basesalary) {
		this.basesalary = basesalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", email=" + email + ", birthdate=" + birthdate + ", basesalary="
				+ basesalary + ", department=" + department + "]";
	}

	@Override
	public void insert(Object obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object deleteById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

	
}
