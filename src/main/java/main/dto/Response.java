package main.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="responses")
public class Response {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String message;
	
	@Column
	private String date;
	
	@ManyToOne
	@JoinColumn(name="writer")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="thread")
	private Threads thread;
	
	public Response() {
		// TODO Auto-generated constructor stub
	}

	public Response(Long id, String message, String date, User user, Threads thread) {
		super();
		this.id = id;
		this.message = message;
		this.date = date;
		this.user = user;
		this.thread = thread;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
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

	public Threads getThread() {
		return thread;
	}

	public void setThread(Threads thread) {
		this.thread = thread;
	}
	
	
}
