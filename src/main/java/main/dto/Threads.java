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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="threads")
public class Threads {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String description;
	
	@Column
	private String date;
	
	@ManyToOne
	@JoinColumn(name="creator")
	private User user;
	
	@OneToMany(cascade= CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "thread")
	public List<Response> responses;
	
	public Threads() {
		// TODO Auto-generated constructor stub
	}

	
	public Threads(Long id, String description, String date, User user, List<Response> responses) {
		super();
		this.id = id;
		this.description = description;
		this.date = date;
		this.user = user;
		this.responses = responses;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@JsonIgnore
	public List<Response> getResponses() {
		return responses;
	}


	public void setResponses(List<Response> responses) {
		this.responses = responses;
	}
	
	
	
}
