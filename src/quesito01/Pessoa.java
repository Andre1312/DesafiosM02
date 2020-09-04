package quesito01;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	
	// atributos
	private String nome;
	private int idade;
	private String sexo;
	
	private static List<Livro> livros = new ArrayList<Livro>();
	
	// construtor
	public Pessoa(String nome, int idade, String sexo, List<Livro> livros) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		Pessoa.livros = livros;
	}
	
	// getters/setters
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public static List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		Pessoa.livros = livros;
	}

	// métodos especificos
	
	/**
	 * Incrementa a idade de Pessoa
	 */
	public void fazerAniversario() {
		//
		
		this.idade++;
		
	}
}
