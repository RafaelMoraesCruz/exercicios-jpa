package modelo.basics;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Usuario {
	
@javax.persistence.Id
@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int Id;

	private String nome;
	
	private String email;
	
	public Usuario() {
		
	}

	public Usuario(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
