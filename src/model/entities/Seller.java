package model.entities;

import java.util.Date;
import java.util.Objects;

public class Seller {
	private Integer id;
	private String name;
	private String email;
	private Date bithDate;
	private Double baseSalary;
	
	private Department department;

	public Seller(Integer id, String name, String email, Date bithDate,Double baseSalary, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.bithDate = bithDate;
		this.department = department;
		this.baseSalary = baseSalary;
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

	public Date getBithDate() {
		return bithDate;
	}

	public void setBithDate(Date bithDate) {
		this.bithDate = bithDate;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	public Double getBaseSalary() {
	 return baseSalary;
	}
	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(id);
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
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", email=" + email + ", bithDate=" + bithDate + ", baseSalary="
				+ baseSalary + ", department=" + department + "]";
	}


}
