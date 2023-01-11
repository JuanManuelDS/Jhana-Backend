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
@Table(name="users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private String surname;
	
	@Column
	private String email;
	
	@Column
	private String password;
	
	@OneToMany(cascade= CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
	private List<UserRole> roles;
	
	@OneToMany(cascade= CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
	private List<Session> sessions;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	private List<Threads> threads;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	private List<Response> responses;
	
	
	
	//--------------- CONSTRUCTORS ------------------------
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	//---------- GETTERS AND SETTERS -------------------------

	public User(Long id, String name, String surname, String email, String password, List<UserRole> roles,
			List<Session> sessions, List<Threads> threads, List<Response> responses) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
		this.roles = roles;
		this.sessions = sessions;
		this.threads = threads;
		this.responses = responses;
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@JsonIgnore
	public List<UserRole> getRoles() {
		return roles;
	}

	public void setRoles(List<UserRole> roles) {
		this.roles = roles;
	}
	@JsonIgnore
	public List<Session> getSessions() {
		return sessions;
	}

	public void setSessions(List<Session> sessions) {
		this.sessions = sessions;
	}
	@JsonIgnore
	public List<Threads> getThreads() {
		return threads;
	}

	public void setThreads(List<Threads> threads) {
		this.threads = threads;
	}
	@JsonIgnore
	public List<Response> getResponses() {
		return responses;
	}

	public void setResponses(List<Response> responses) {
		this.responses = responses;
	}
	
	
	
	
}
