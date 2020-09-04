package quesito01;

public class Almanaque extends Livro{
	
	
	
	// construtor
	public Almanaque(String titulo, String autor, int totalPaginas, int paginaAtual, boolean aberto, Pessoa pessoa) {
		super(titulo, autor, totalPaginas, pessoa);
		
	}

	// métodos específicos
	public void folhear() {
		super.folhear(2);
	}
	
	// métodos interface
	@Override
	public void avancarPagina() {
		//
		if(super.getTotalPaginas() % 2 == 0) {
			super.avancarPagina();
			super.avancarPagina();
			
		}else if(super.getPaginaAtual() <= (super.getTotalPaginas()-1)) {
			super.avancarPagina();
			super.avancarPagina();
			
		}else {
			super.avancarPagina();
		}
	}
}
