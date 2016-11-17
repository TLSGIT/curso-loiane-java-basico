package com.loiane.cursojava.aula43.ObjectClass;

public class Aluno {
	
	private String nome, endereco, escola;
	private int cpf, idade;
	
	/** Constructor without fields */
	public Aluno(){
		System.out.println("Aluno criado sem atributos setados.");
	}
	
	
	/** Constructor using fields */
	public Aluno(String nome, String endereco, String escola, int cpf, int idade) {
		System.out.println("Aluno criado com atributos setados.");
		this.setNome(nome);
		this.setCpf(cpf);
		this.setEndereco(endereco);
		this.setEscola(escola);
		this.setIdade(idade);
	}
	
	/** Getters and Setters */
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEscola() {
		return escola;
	}
	public void setEscola(String escola) {
		this.escola = escola;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}


	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", endereco=" + endereco + ", escola=" + escola + ", cpf=" + cpf + ", idade="
				+ idade + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (cpf != other.cpf)
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (escola == null) {
			if (other.escola != null)
				return false;
		} else if (!escola.equals(other.escola))
			return false;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
	
	

}
