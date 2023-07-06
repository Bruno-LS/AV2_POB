package Alugar;

import java.time.LocalDate;

public class Cliente {

	private int id;
	private String nome;
	private String endereco;
	private String postalCode;
	private String pais;
	private String cpf;
	private String passaporte;
	private String email;
	private LocalDate dataNascimento;
	
	public Cliente(int id, String nome, String endereco, String postalCode, String pais, String cpf, String passaporte, String email, LocalDate dataNascimento) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.postalCode = postalCode;
		this.pais = pais;
		this.cpf = cpf;
		this.passaporte = passaporte;
		this.email = email;
		this.dataNascimento = dataNascimento;
	}

	
	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getPais() {
		return pais;
	}

	public String getCpf() {
		return cpf;
	}

	public String getPassaporte() {
		return passaporte;
	}

	public String getEmail() {
		return email;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	
}
