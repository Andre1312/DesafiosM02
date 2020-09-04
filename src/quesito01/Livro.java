package quesito01;

public class Livro implements Publicacao{

	// atributos
	private String titulo;
	private String autor;
	private int totalPaginas;
	private int paginaAtual;
	private boolean aberto;

	private Pessoa pessoa;

	// construtor

	/**
	 * Todo livro inicialmente tera paginaAtual = 0 e estara fechado
	 * @param titulo : String
	 * @param autor : String
	 * @param totalPaginas : int
	 * @param pessoa : Pessoa
	 */
	public Livro(String titulo, String autor, int totalPaginas, Pessoa pessoa) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totalPaginas = totalPaginas;
		this.paginaAtual = 0;
		this.aberto = false;
		this.pessoa = pessoa;
	}

	// getters/setters

	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public int getTotalPaginas() {
		return totalPaginas;
	}


	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}


	public int getPaginaAtual() {
		return paginaAtual;
	}


	public void setPaginaAtual(int paginaAtual) {
		this.paginaAtual = paginaAtual;
	}


	public boolean isAberto() {
		return aberto;
	}


	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}


	public Pessoa getPessoa() {
		return pessoa;
	}


	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}


	// métodos especificos


	public String detalhes() {
		String comma = "+";
		String detalhe =		this.getTitulo() 			+comma+
								this.getAutor()  			+comma+
								this.getTotalPaginas()		+comma+
								this.getPaginaAtual()		+comma+
								this.isAberto()				+comma+
								this.pessoa.getNome()		;	
		return detalhe;
	}

	// métodos interface

	@Override
	public void abrir() {
		//
		int aux = 0;
		for (Livro livro : Pessoa.getLivros()) {
			if (livro.isAberto()) {
				aux++;
			}
		}

		if (aux==0) {
			this.setAberto(true);
		}

	}

	@Override
	public void fechar() {
		//
		if (isAberto()) {
			this.setAberto(false);
		}

	}

	@Override
	public void folhear(int pagina) {
		// 
		if (isAberto()) {

			if ((pagina >= 0) && (pagina <= this.totalPaginas))	{

				this.paginaAtual = pagina;
			}

		}
	}
	@Override
	public void avancarPagina() {
		//
		if (isAberto()) {
			if (!(this.paginaAtual >= this.totalPaginas)) {
				this.paginaAtual++ ;
			}
		}


	}

	@Override
	public void voltarPagina() {
		//
		if (isAberto()) {
			if (!(this.paginaAtual <= 0)) {
				this.paginaAtual-- ;
			}
		}
	}
}
