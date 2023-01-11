package main.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="role")
public class Role {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String name;
	
	@OneToMany(mappedBy = "role", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<UserRole> usuarios;
	
	public Role() {
		// TODO Auto-generated constructor stub
	}

	public Role(Long id, String name, List<UserRole> usuarios) {
		super();
		this.id = id;
		this.name = name;
		this.usuarios = usuarios;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@JsonIgnore
	public List<UserRole> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<UserRole> usuarios) {
		this.usuarios = usuarios;
	}
	
	
}
