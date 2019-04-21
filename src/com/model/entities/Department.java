package com.model.entities;

import java.io.Serializable;
import java.util.List;

import com.model.dao.IOperationDao;

public class Department implements Serializable, IOperationDao {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String name;

	public Department() {
	}

	public Department(Integer id, String name) {
		super();
		this.setId(id);
		this.setName(name);
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
		Department other = (Department) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(this.getId() + ", " + this.getName());

		return sb.toString();
	}

	@Override
	public void insert(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("Metodo Insert testado com sucesso!!");
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
