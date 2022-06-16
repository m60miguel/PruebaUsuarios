package co.com.cliente.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
	private long id;
	@Column(name = "surname", nullable = false)
	private String surname;
	@Column(name = "document", nullable = false)
	private String document;
	@Column(name = "email", nullable = false)
	private String email;
	
	public Usuario() {
		
	}

	public Usuario(long id, String surname, String document, String email) {
		super();
		this.id = id;
		this.surname = surname;
		this.document = document;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
