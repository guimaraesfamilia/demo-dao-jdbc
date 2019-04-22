package com.model.entities;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.model.dao.IOperationDao;
import com.model.db.DB;
import com.model.db.DbException;

public class Seller implements Serializable, IOperationDao {

	private Connection conn = null;
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String name;
	private String email;
	private Date birthdate;
	private Double basesalary;
	private Department department;

	public Seller() {

		conn = DB.getConnection();
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

		PreparedStatement pst = null;
		ResultSet rs = null;

		try {

			pst = conn.prepareStatement(
					"select seller.* ,department.Name as DepName from seller inner join department on seller.DepartmentId = departmentId where seller.Id = ? ");
			pst.setInt(1, id);

			rs = pst.executeQuery();

			if (rs.next()) {

				Department dp = new Department();
				dp.setId(rs.getInt("DepartmentId"));
				dp.setName(rs.getString("DepName"));

				Seller obj = new Seller();
				obj.setId(rs.getInt("Id"));
				obj.setName(rs.getString("Name"));
				obj.setEmail(rs.getString("Email"));
				obj.setBirthdate(rs.getDate("BirthDate"));
				obj.setBasesalary(rs.getDouble("BaseSalary"));
				obj.setDepartment(dp);
				return obj;

			}
			return null;

		} catch (SQLException e) {

			throw new DbException(e.getMessage());
		} finally {

			DB.closePrepareStatement(pst);
			DB.closeResultSet(rs);
		}

	}

	@Override
	public List<Object> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
