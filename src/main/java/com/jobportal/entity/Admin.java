package com.jobportal.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.jobportal.dto.AdminDTO;

@Entity
public class Admin {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@NotNull(message = "Firstname should not be empty")
	private String firstName;
	@NotNull(message ="Lastname should not be empty")
	private String lastName;
	@NotNull(message ="Entering password is mandatory")
	private String password;
	
	public Admin() {
		super();
	}
	
	
	public Admin(int id, String firstName, String lastName, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Admin [Id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", password=" + password
				+ "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, firstName, lastName, password);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admin other = (Admin) obj;
		return Objects.equals(id, other.id) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(password, other.password);
	}
	public AdminDTO toAdminDTO() {
		AdminDTO adminDTO = new AdminDTO();
		adminDTO.setId(this.id);
		adminDTO.setFirstName(this.firstName);
		adminDTO.setLastName(this.lastName);
		adminDTO.setPassword(this.password);
		return adminDTO;
	}
}
